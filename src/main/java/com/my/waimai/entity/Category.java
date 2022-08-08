package com.my.waimai.entity;


import java.util.Date; 


/**

  自增主键: 无
*/ 


public class Category 
{ 
 
	private Long id ;
	private Integer type ;
	private String name ;
	private Integer sort ;
	private Date createTime;
	private Date updateTime;
	private Long createUser;
	private Long updateUser;


	public void setId(Long id)
	{
		this.id=id;
	}
	public Long getId()
	{
		return this.id;
	}
	public void setType(Integer type)
	{
		this.type=type;
	}
	public Integer getType()
	{
		return this.type;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setSort(Integer sort)
	{
		this.sort=sort;
	}
	public Integer getSort()
	{
		return this.sort;
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

} 
 