package com.zwx.dto;


import com.zwx.entity.Setmeal;
import com.zwx.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
