package com.my.waimai.entity;


/**

  自增主键: 无
*/ 


public class OrderDetail 
{ 
 
	private Long id ;
	private String name ;
	private String image ;
	private Long orderId;
	private Long dishId;
	private Long setmealId;
	private String dishFlavor;
	private Integer number ;
	private String amount ;


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
	public void setOrderId(Long orderId)
	{
		this.orderId = orderId;
	}
	public Long getOrderId()
	{
		return this.orderId;
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

} 
 