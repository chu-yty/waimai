package com.my.waimai.entity;

import af.sql.annotation.AFCOLUMNS; 
import af.sql.annotation.AFTABLE; 
import java.util.Date; 

/** 本类由 POJO生成器 自动生成于 2022-08-07 10:39:58
    作者：阿发你好      官网: http://afanihao.cn 
*/ 

/** INSERT语句 ( 预处理方式 ) 
  INSERT INTO `setmeal_dish`
        (`id`, `setmeal_id`, `dish_id`, `name`, `price`, `copies`, `sort`, `create_time`, `update_time`, `create_user`, `update_user`, `is_deleted`) 
  VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) 
*/ 

/** INSERT语句 ( MyBatis方式 ) 
  INSERT INTO `setmeal_dish`
        (`id`, `setmeal_id`, `dish_id`, `name`, `price`, `copies`, `sort`, `create_time`, `update_time`, `create_user`, `update_user`, `is_deleted`) 
  VALUES(#{id}, #{setmeal_id}, #{dish_id}, #{name}, #{price}, #{copies}, #{sort}, #{create_time}, #{update_time}, #{create_user}, #{update_user}, #{is_deleted}) 

  自增主键: 无
*/ 

@AFTABLE(name="setmeal_dish")  
@AFCOLUMNS() 
public class SetmealDish 
{ 
 
	public Long id ; 
	public String setmeal_id ; 
	public String dish_id ; 
	public String name ; 
	public String price ; 
	public Integer copies ; 
	public Integer sort ; 
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
	public void setSetmeal_id(String setmeal_id)
	{
		this.setmeal_id=setmeal_id;
	}
	public String getSetmeal_id()
	{
		return this.setmeal_id;
	}
	public void setDish_id(String dish_id)
	{
		this.dish_id=dish_id;
	}
	public String getDish_id()
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
	public void setPrice(String price)
	{
		this.price=price;
	}
	public String getPrice()
	{
		return this.price;
	}
	public void setCopies(Integer copies)
	{
		this.copies=copies;
	}
	public Integer getCopies()
	{
		return this.copies;
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
	public void setIs_deleted(Integer is_deleted)
	{
		this.is_deleted=is_deleted;
	}
	public Integer getIs_deleted()
	{
		return this.is_deleted;
	}

} 
 