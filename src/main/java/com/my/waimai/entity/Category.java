package com.my.waimai.entity;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;

import java.time.LocalDateTime;
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

	//创建时间
	@TableField(fill = FieldFill.INSERT)
	private LocalDateTime createTime;

	//更新时间
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private LocalDateTime updateTime;

	//创建人
	@TableField(fill = FieldFill.INSERT)
	private Long createUser;

	//修改人
	@TableField(fill = FieldFill.INSERT_UPDATE)
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

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
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
 