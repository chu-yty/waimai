package com.my.waimai.entity;


import java.util.Date; 

/**
  自增主键: 无
*/ 


public class ShoppingCart 
{ 
 
	public Long id ; 
	public String name ; 
	public String image ; 
	public Long userId;
	public Long dishId;
	public Long setmealId;
	public String dishFlavor;
	public Integer number ; 
	public String amount ; 
	public Date createTime;


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
	public void setUserId(Long userId)
	{
		this.userId = userId;
	}
	public Long getUserId()
	{
		return this.userId;
	}
	public void setDishId(Long dishId)
	{
		this.dishId = dishId;
	}
	public Long getDishId()
	{
		return this.dishId;
	}
	public void setSetmealId(Long setmealId)
	{
		this.setmealId = setmealId;
	}
	public Long getSetmealId()
	{
		return this.setmealId;
	}
	public void setDishFlavor(String dishFlavor)
	{
		this.dishFlavor = dishFlavor;
	}
	public String getDishFlavor()
	{
		return this.dishFlavor;
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
	public void setCreateTime(Date createTime)
	{
		this.createTime = createTime;
	}
	public Date getCreateTime()
	{
		return this.createTime;
	}

} 
 