package com.my.waimai.entity;

import af.sql.annotation.AFCOLUMNS; 
import af.sql.annotation.AFTABLE; 
import java.util.Date; 

/** 本类由 POJO生成器 自动生成于 2022-08-07 10:39:58
    作者：阿发你好      官网: http://afanihao.cn 
*/ 

/** INSERT语句 ( 预处理方式 ) 
  INSERT INTO `category`
        (`id`, `type`, `name`, `sort`, `create_time`, `update_time`, `create_user`, `update_user`) 
  VALUES(?, ?, ?, ?, ?, ?, ?, ?) 
*/ 

/** INSERT语句 ( MyBatis方式 ) 
  INSERT INTO `category`
        (`id`, `type`, `name`, `sort`, `create_time`, `update_time`, `create_user`, `update_user`) 
  VALUES(#{id}, #{type}, #{name}, #{sort}, #{create_time}, #{update_time}, #{create_user}, #{update_user}) 

  自增主键: 无
*/ 

@AFTABLE(name="category")  
@AFCOLUMNS() 
public class Category 
{ 
 
	public Long id ; 
	public Integer type ; 
	public String name ; 
	public Integer sort ; 
	public Date create_time ; 
	public Date update_time ; 
	public Long create_user ; 
	public Long update_user ; 


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
	public void setCreate_time(Date create_time)
	{
		this.create_time=create_time;
	}
	public Date getCreate_time()
	{
		return this.create_time;
	}
	public void setUpdate_time(Date update_time)
	{
		this.update_time=update_time;
	}
	public Date getUpdate_time()
	{
		return this.update_time;
	}
	public void setCreate_user(Long create_user)
	{
		this.create_user=create_user;
	}
	public Long getCreate_user()
	{
		return this.create_user;
	}
	public void setUpdate_user(Long update_user)
	{
		this.update_user=update_user;
	}
	public Long getUpdate_user()
	{
		return this.update_user;
	}

} 
 