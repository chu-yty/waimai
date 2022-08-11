package com.my.waimai.entity;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
  自增主键: 无
*/ 

@Data
public class SetmealDish implements Serializable
{
	private static final long serialVersionUID = 1L;
	public Long id ; 
	public Long setmealId;
	public String dishId;
	public String name ; 
	public String price ; 
	public Integer copies ; 
	public Integer sort ;
	@TableField(fill = FieldFill.INSERT )
	public LocalDateTime createTime;
	@TableField(fill=FieldFill.INSERT_UPDATE)
	public LocalDateTime updateTime;
	@TableField(fill = FieldFill.INSERT )
	public Long createUser;
	@TableField(fill = FieldFill.INSERT_UPDATE )
	public Long updateUser;
	public Integer isDeleted;

}
 