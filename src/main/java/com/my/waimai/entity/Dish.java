package com.my.waimai.entity;

import af.sql.annotation.AFCOLUMNS; 
import af.sql.annotation.AFTABLE; 
import java.util.Date; 

/** 本类由 POJO生成器 自动生成于 2022-08-07 10:39:58
    作者：阿发你好      官网: http://afanihao.cn 
*/ 

/** INSERT语句 ( 预处理方式 ) 
  INSERT INTO `dish`
        (`id`, `name`, `category_id`, `price`, `code`, `image`, `description`, `status`, `sort`, `create_time`, `update_time`, `create_user`, `update_user`, `is_deleted`) 
  VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) 
*/ 

/** INSERT语句 ( MyBatis方式 ) 
  INSERT INTO `dish`
        (`id`, `name`, `category_id`, `price`, `code`, `image`, `description`, `status`, `sort`, `create_time`, `update_time`, `create_user`, `update_user`, `is_deleted`) 
  VALUES(#{id}, #{name}, #{category_id}, #{price}, #{code}, #{image}, #{description}, #{status}, #{sort}, #{create_time}, #{update_time}, #{create_user}, #{update_user}, #{is_deleted}) 

  自增主键: 无
*/ 

@AFTABLE(name="dish")  
@AFCOLUMNS() 
public class Dish 
{ 
 
	public Long id ; 
	public String name ; 
	public Long category_id ; 
	public String price ; 
	public String code ; 
	public String image ; 
	public String description ; 
	public Integer status ; 
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
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setCategory_id(Long category_id)
	{
		this.category_id=category_id;
	}
	public Long getCategory_id()
	{
		return this.category_id;
	}
	public void setPrice(String price)
	{
		this.price=price;
	}
	public String getPrice()
	{
		return this.price;
	}
	public void setCode(String code)
	{
		this.code=code;
	}
	public String getCode()
	{
		return this.code;
	}
	public void setImage(String image)
	{
		this.image=image;
	}
	public String getImage()
	{
		return this.image;
	}
	public void setDescription(String description)
	{
		this.description=description;
	}
	public String getDescription()
	{
		return this.description;
	}
	public void setStatus(Integer status)
	{
		this.status=status;
	}
	public Integer getStatus()
	{
		return this.status;
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
 