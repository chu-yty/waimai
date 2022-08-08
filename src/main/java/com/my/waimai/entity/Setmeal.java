package com.my.waimai.entity;


import java.util.Date; 

/**
  自增主键: 无
*/ 


public class Setmeal 
{ 
 
	private Long id ;
	private Long categoryId;
	private String name ;
	private String price ;
	private Integer status ;
	private String code ;
	private String description ;
	private String image ;
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
	public void setCategoryId(Long categoryId)
	{
		this.categoryId = categoryId;
	}
	public Long getCategoryId()
	{
		return this.categoryId;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setPrice(String price)
	{
		this.price=price;
	}
	public String getPrice()
	{
		return this.price;
	}
	public void setStatus(Integer status)
	{
		this.status=status;
	}
	public Integer getStatus()
	{
		return this.status;
	}
	public void setCode(String code)
	{
		this.code=code;
	}
	public String getCode()
	{
		return this.code;
	}
	public void setDescription(String description)
	{
		this.description=description;
	}
	public String getDescription()
	{
		return this.description;
	}
	public void setImage(String image)
	{
		this.image=image;
	}
	public String getImage()
	{
		return this.image;
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
 