package com.zwx.common;

/**
 * @author 张文旭
 * @create 2022/7/26 13:58
 * 基于ThreadLocal 封装工具类,用于保存喝获取当前登录用户id
 * @description：
 */
public class BaseContext {

    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }
    public static Long getCurrentId() {
      return   threadLocal.get();
    }
}
