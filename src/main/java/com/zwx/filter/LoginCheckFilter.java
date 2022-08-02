package com.zwx.filter;

import com.alibaba.fastjson.JSON;
import com.zwx.common.BaseContext;
import com.zwx.config.R;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.util.AntPathMatcher;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 张文旭
 * @create 2022/7/19 14:09
 * @description：
 */
@WebFilter(filterName = "loginCheckFilter", urlPatterns = "/*")
@Slf4j
public class LoginCheckFilter implements Filter {

    public static final AntPathMatcher ANT_PATH_MATCHER = new AntPathMatcher();

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        //获取本次请求的uri
        String requestUri = request.getRequestURI();
        String[] urls = new String[]{"/employee/login", "/employee/logout", "/backend/**", "/front/**","common/**","/user/sendMsg","/user/login"};

        //判断本次请求是否需要处理
        boolean checked = check(urls, requestUri);
        if (checked) {
            filterChain.doFilter(request, response);
            return;
        }
        //判断登录状态,如果已经登陆,则直接放行
        if (request.getSession().getAttribute("employee") != null) {
            Long id = (Long) request.getSession().getAttribute("employee");
            BaseContext.setCurrentId(id);
            filterChain.doFilter(request, response);
            return;
        }

        if (request.getSession().getAttribute("user") != null) {
            Long userId = (Long) request.getSession().getAttribute("employee");
            BaseContext.setCurrentId(userId);
            filterChain.doFilter(request, response);
            return;
        }
        //如果没有登陆则返回未登录结果,通过输出流方式向客户端页面响应数据
        response.getWriter().write(JSON.toJSONString(R.error("NOTLOGIN")));
        return;

    }

    //检查路径是否匹配
    public boolean check(String[] urls, String requestUri) {
        for (String url : urls) {
            boolean match = ANT_PATH_MATCHER.match(url, requestUri);
            if (match) {
                return true;
            } else {

            }
        }
        return false;
    }
}
