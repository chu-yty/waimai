package com.my.waimai.entity;

import af.sql.annotation.AFCOLUMNS; 
import af.sql.annotation.AFTABLE; 
import java.util.Date; 

/** 本类由 POJO生成器 自动生成于 2022-08-07 10:39:58
    作者：阿发你好      官网: http://afanihao.cn 
*/ 

/** INSERT语句 ( 预处理方式 ) 
  INSERT INTO `dish_flavor`
        (`id`, `dish_id`, `name`, `value`, `create_time`, `update_time`, `create_user`, `update_user`, `is_deleted`) 
  VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?) 
*/ 

/** INSERT语句 ( MyBatis方式 ) 
  INSERT INTO `dish_flavor`
        (`id`, `dish_id`, `name`, `value`, `create_time`, `update_time`, `create_user`, `update_user`, `is_deleted`) 
  VALUES(#{id}, #{dish_id}, #{name}, #{value}, #{create_time}, #{update_time}, #{create_user}, #{update_user}, #{is_deleted}) 

  自增主键: 无
*/ 

@AFTABLE(name="dish_flavor")  
@AFCOLUMNS() 
public class DishFlavor 
{ 
 
	public Long id ; 
	public Long dish_id ; 
	public String name ; 
	public String value ; 
	public Date create_time ; 
	public Date update_time ; 
	public Long create_user ; 
	public Long update_user ; 
	public Integer is_deleted ; 


	public void setId(Long id)
	{
		this.id=id;
	}
	public Long getId()
	{
		return this.id;
	}
	public void setDish_id(Long dish_id)
	{
		this.dish_id=dish_id;
	}
	public Long getDish_id()
	{
		return this.dish_id;
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
	public void setIs_deleted(Integer is_deleted)
	{
		this.is_deleted=is_deleted;
	}
	public Integer getIs_deleted()
	{
		return this.is_deleted;
	}

} 
 