package com.my.waimai.entity;


import java.util.Date; 

/**
  自增主键: 无
*/ 


public class SetmealDish 
{ 
 
	public Long id ; 
	public String setmealId;
	public String dishId;
	public String name ; 
	public String price ; 
	public Integer copies ; 
	public Integer sort ; 
	public Date createTime;
	public Date updateTime;
	public Long createUser;
	public Long updateUser;
	public Integer isDeleted;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSetmealId() {
		return setmealId;
	}

	public void setSetmealId(String setmealId) {
		this.setmealId = setmealId;
	}

	public String getDishId() {
		return dishId;
	}

	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Integer getCopies() {
		return copies;
	}

	public void setCopies(Integer copies) {
		this.copies = copies;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}

	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
}
 