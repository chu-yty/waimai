package com.my.waimai.entity;

import af.sql.annotation.AFCOLUMNS; 
import af.sql.annotation.AFTABLE; 
import java.util.Date; 

/** 本类由 POJO生成器 自动生成于 2022-08-07 10:39:58
    作者：阿发你好      官网: http://afanihao.cn 
*/ 

/** INSERT语句 ( 预处理方式 ) 
  INSERT INTO `shopping_cart`
        (`id`, `name`, `image`, `user_id`, `dish_id`, `setmeal_id`, `dish_flavor`, `number`, `amount`, `create_time`) 
  VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?) 
*/ 

/** INSERT语句 ( MyBatis方式 ) 
  INSERT INTO `shopping_cart`
        (`id`, `name`, `image`, `user_id`, `dish_id`, `setmeal_id`, `dish_flavor`, `number`, `amount`, `create_time`) 
  VALUES(#{id}, #{name}, #{image}, #{user_id}, #{dish_id}, #{setmeal_id}, #{dish_flavor}, #{number}, #{amount}, #{create_time}) 

  自增主键: 无
*/ 

@AFTABLE(name="shopping_cart")  
@AFCOLUMNS() 
public class ShoppingCart 
{ 
 
	public Long id ; 
	public String name ; 
	public String image ; 
	public Long user_id ; 
	public Long dish_id ; 
	public Long setmeal_id ; 
	public String dish_flavor ; 
	public Integer number ; 
	public String amount ; 
	public Date create_time ; 


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
	public void setUser_id(Long user_id)
	{
		this.user_id=user_id;
	}
	public Long getUser_id()
	{
		return this.user_id;
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
	public void setCreate_time(Date create_time)
	{
		this.create_time=create_time;
	}
	public Date getCreate_time()
	{
		return this.create_time;
	}

} 
 