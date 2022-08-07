package com.my.waimai.entity;

import af.sql.annotation.AFCOLUMNS; 
import af.sql.annotation.AFTABLE; 
import java.util.Date; 

/** 本类由 POJO生成器 自动生成于 2022-08-07 10:39:58
    作者：阿发你好      官网: http://afanihao.cn 
*/ 

/** INSERT语句 ( 预处理方式 ) 
  INSERT INTO `address_book`
        (`id`, `user_id`, `consignee`, `sex`, `phone`, `province_code`, `province_name`, `city_code`, `city_name`, `district_code`, `district_name`, `detail`, `label`, `is_default`, `create_time`, `update_time`, `create_user`, `update_user`, `is_deleted`) 
  VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) 
*/ 

/** INSERT语句 ( MyBatis方式 ) 
  INSERT INTO `address_book`
        (`id`, `user_id`, `consignee`, `sex`, `phone`, `province_code`, `province_name`, `city_code`, `city_name`, `district_code`, `district_name`, `detail`, `label`, `is_default`, `create_time`, `update_time`, `create_user`, `update_user`, `is_deleted`) 
  VALUES(#{id}, #{user_id}, #{consignee}, #{sex}, #{phone}, #{province_code}, #{province_name}, #{city_code}, #{city_name}, #{district_code}, #{district_name}, #{detail}, #{label}, #{is_default}, #{create_time}, #{update_time}, #{create_user}, #{update_user}, #{is_deleted}) 

  自增主键: 无
*/ 

@AFTABLE(name="address_book")  
@AFCOLUMNS() 
public class AddressBook 
{ 
 
	public Long id ; 
	public Long user_id ; 
	public String consignee ; 
	public Byte sex ; 
	public String phone ; 
	public String province_code ; 
	public String province_name ; 
	public String city_code ; 
	public String city_name ; 
	public String district_code ; 
	public String district_name ; 
	public String detail ; 
	public String label ; 
	public Boolean is_default ; 
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
	public void setUser_id(Long user_id)
	{
		this.user_id=user_id;
	}
	public Long getUser_id()
	{
		return this.user_id;
	}
	public void setConsignee(String consignee)
	{
		this.consignee=consignee;
	}
	public String getConsignee()
	{
		return this.consignee;
	}
	public void setSex(Byte sex)
	{
		this.sex=sex;
	}
	public Byte getSex()
	{
		return this.sex;
	}
	public void setPhone(String phone)
	{
		this.phone=phone;
	}
	public String getPhone()
	{
		return this.phone;
	}
	public void setProvince_code(String province_code)
	{
		this.province_code=province_code;
	}
	public String getProvince_code()
	{
		return this.province_code;
	}
	public void setProvince_name(String province_name)
	{
		this.province_name=province_name;
	}
	public String getProvince_name()
	{
		return this.province_name;
	}
	public void setCity_code(String city_code)
	{
		this.city_code=city_code;
	}
	public String getCity_code()
	{
		return this.city_code;
	}
	public void setCity_name(String city_name)
	{
		this.city_name=city_name;
	}
	public String getCity_name()
	{
		return this.city_name;
	}
	public void setDistrict_code(String district_code)
	{
		this.district_code=district_code;
	}
	public String getDistrict_code()
	{
		return this.district_code;
	}
	public void setDistrict_name(String district_name)
	{
		this.district_name=district_name;
	}
	public String getDistrict_name()
	{
		return this.district_name;
	}
	public void setDetail(String detail)
	{
		this.detail=detail;
	}
	public String getDetail()
	{
		return this.detail;
	}
	public void setLabel(String label)
	{
		this.label=label;
	}
	public String getLabel()
	{
		return this.label;
	}
	public void setIs_default(Boolean is_default)
	{
		this.is_default=is_default;
	}
	public Boolean getIs_default()
	{
		return this.is_default;
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
 