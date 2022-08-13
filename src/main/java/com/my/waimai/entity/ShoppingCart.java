package com.my.waimai.entity;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
  自增主键: 无
*/ 

@Data
public class ShoppingCart implements Serializable
{

	private static final long serialVersionUID = 1L;
	private Long id ;
	private String name ;
	private String image ;
	private Long userId;
	private Long dishId;
	private Long setmealId;
	private String dishFlavor;
	private Integer number ;
	private BigDecimal amount ;
	private LocalDateTime createTime;

} 
 