package com.my.waimai.mytype;

import com.my.waimai.entity.Setmeal;
import com.my.waimai.entity.SetmealDish;
import lombok.Data;

import java.util.List;
@Data
public class SetmealDto extends Setmeal{
    private List<SetmealDish> setmealDishes;
    private String categoryName ;

}
