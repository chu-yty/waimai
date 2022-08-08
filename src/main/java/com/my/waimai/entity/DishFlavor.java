package com.my.waimai.entity;


import java.util.Date; 

/**
  自增主键: 无
*/ 


public class DishFlavor 
{ 
 
	private Long id ;
	private Long dishId;
	private String name ;
	private String value ;
	private Date createTime;
	private Date updateTime;
	private Long createUser;
	private Long updateUser;
	private Integer isDeleted;


	public void setId(Long id)
	{
		this.id=id;
	}
	public Long getId()
	{
		return this.id;
	}
	public void setDishId(Long dishId)
	{
		this.dishId = dishId;
	}
	public Long getDishId()
	{
		return this.dishId;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setValue(String value)
	{
		this.value=value;
	}
	public String getValue()
	{
		return this.value;
	}
	public void setCreateTime(Date createTime)
	{
		this.createTime = createTime;
	}
	public Date getCreateTime()
	{
		return this.createTime;
	}
	public void setUpdateTime(Date updateTime)
	{
		this.updateTime = updateTime;
	}
	public Date getUpdateTime()
	{
		return this.updateTime;
	}
	public void setCreateUser(Long createUser)
	{
		this.createUser = createUser;
	}
	public Long getCreateUser()
	{
		return this.createUser;
	}
	public void setUpdateUser(Long updateUser)
	{
		this.updateUser = updateUser;
	}
	public Long getUpdateUser()
	{
		return this.updateUser;
	}
	public void setIsDeleted(Integer isDeleted)
	{
		this.isDeleted = isDeleted;
	}
	public Integer getIsDeleted()
	{
		return this.isDeleted;
	}

} 
 