package com.my.waimai.entity;

import af.sql.annotation.AFCOLUMNS; 
import af.sql.annotation.AFTABLE; 
import java.util.Date; 

/** 

  自增主键: 无
*/ 

public class User 
{ 
 
	public Long id ; 
	public String name ; 
	public String phone ; 
	public String sex ; 
	public String idNumber ; 
	public String avatar ; 
	public Integer status ; 


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
	public void setPhone(String phone)
	{
		this.phone=phone;
	}
	public String getPhone()
	{
		return this.phone;
	}
	public void setSex(String sex)
	{
		this.sex=sex;
	}
	public String getSex()
	{
		return this.sex;
	}
	public void setId_number(String id_number)
	{
		this.id_number=id_number;
	}
	public String getId_number()
	{
		return this.id_number;
	}
	public void setAvatar(String avatar)
	{
		this.avatar=avatar;
	}
	public String getAvatar()
	{
		return this.avatar;
	}
	public void setStatus(Integer status)
	{
		this.status=status;
	}
	public Integer getStatus()
	{
		return this.status;
	}

} 
 