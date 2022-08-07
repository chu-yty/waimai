package com.my.waimai.entity;

import af.sql.annotation.AFCOLUMNS; 
import af.sql.annotation.AFTABLE; 
import java.util.Date; 

/** 本类由 POJO生成器 自动生成于 2022-08-07 10:39:58
    作者：阿发你好      官网: http://afanihao.cn 
*/ 

/** INSERT语句 ( 预处理方式 ) 
  INSERT INTO `order_detail`
        (`id`, `name`, `image`, `order_id`, `dish_id`, `setmeal_id`, `dish_flavor`, `number`, `amount`) 
  VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?) 
*/ 

/** INSERT语句 ( MyBatis方式 ) 
  INSERT INTO `order_detail`
        (`id`, `name`, `image`, `order_id`, `dish_id`, `setmeal_id`, `dish_flavor`, `number`, `amount`) 
  VALUES(#{id}, #{name}, #{image}, #{order_id}, #{dish_id}, #{setmeal_id}, #{dish_flavor}, #{number}, #{amount}) 

  自增主键: 无
*/ 

@AFTABLE(name="order_detail")  
@AFCOLUMNS() 
public class OrderDetail 
{ 
 
	public Long id ; 
	public String name ; 
	public String image ; 
	public Long order_id ; 
	public Long dish_id ; 
	public Long setmeal_id ; 
	public String dish_flavor ; 
	public Integer number ; 
	public String amount ; 


	public void setId(Long id)
	{
		this.id=id;
	}
	public Long getId()
	{
		return this.id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setImage(String image)
	{
		this.image=image;
	}
	public String getImage()
	{
		return this.image;
	}
	public void setOrder_id(Long order_id)
	{
		this.order_id=order_id;
	}
	public Long getOrder_id()
	{
		return this.order_id;
	}
	public void setDish_id(Long dish_id)
	{
		this.dish_id=dish_id;
	}
	public Long getDish_id()
	{
		return this.dish_id;
	}
	public void setSetmeal_id(Long setmeal_id)
	{
		this.setmeal_id=setmeal_id;
	}
	public Long getSetmeal_id()
	{
		return this.setmeal_id;
	}
	public void setDish_flavor(String dish_flavor)
	{
		this.dish_flavor=dish_flavor;
	}
	public String getDish_flavor()
	{
		return this.dish_flavor;
	}
	public void setNumber(Integer number)
	{
		this.number=number;
	}
	public Integer getNumber()
	{
		return this.number;
	}
	public void setAmount(String amount)
	{
		this.amount=amount;
	}
	public String getAmount()
	{
		return this.amount;
	}

} 
 