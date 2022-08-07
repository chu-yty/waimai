package com.my.waimai.entity;

import af.sql.annotation.AFCOLUMNS; 
import af.sql.annotation.AFTABLE; 
import java.util.Date; 

/** 本类由 POJO生成器 自动生成于 2022-08-07 10:39:58
    作者：阿发你好      官网: http://afanihao.cn 
*/ 

/** INSERT语句 ( 预处理方式 ) 
  INSERT INTO `orders`
        (`id`, `number`, `status`, `user_id`, `address_book_id`, `order_time`, `checkout_time`, `pay_method`, `amount`, `remark`, `phone`, `address`, `user_name`, `consignee`) 
  VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) 
*/ 

/** INSERT语句 ( MyBatis方式 ) 
  INSERT INTO `orders`
        (`id`, `number`, `status`, `user_id`, `address_book_id`, `order_time`, `checkout_time`, `pay_method`, `amount`, `remark`, `phone`, `address`, `user_name`, `consignee`) 
  VALUES(#{id}, #{number}, #{status}, #{user_id}, #{address_book_id}, #{order_time}, #{checkout_time}, #{pay_method}, #{amount}, #{remark}, #{phone}, #{address}, #{user_name}, #{consignee}) 

  自增主键: 无
*/ 

@AFTABLE(name="orders")  
@AFCOLUMNS() 
public class Orders 
{ 
 
	public Long id ; 
	public String number ; 
	public Integer status ; 
	public Long user_id ; 
	public Long address_book_id ; 
	public Date order_time ; 
	public Date checkout_time ; 
	public Integer pay_method ; 
	public String amount ; 
	public String remark ; 
	public String phone ; 
	public String address ; 
	public String user_name ; 
	public String consignee ; 


	public void setId(Long id)
	{
		this.id=id;
	}
	public Long getId()
	{
		return this.id;
	}
	public void setNumber(String number)
	{
		this.number=number;
	}
	public String getNumber()
	{
		return this.number;
	}
	public void setStatus(Integer status)
	{
		this.status=status;
	}
	public Integer getStatus()
	{
		return this.status;
	}
	public void setUser_id(Long user_id)
	{
		this.user_id=user_id;
	}
	public Long getUser_id()
	{
		return this.user_id;
	}
	public void setAddress_book_id(Long address_book_id)
	{
		this.address_book_id=address_book_id;
	}
	public Long getAddress_book_id()
	{
		return this.address_book_id;
	}
	public void setOrder_time(Date order_time)
	{
		this.order_time=order_time;
	}
	public Date getOrder_time()
	{
		return this.order_time;
	}
	public void setCheckout_time(Date checkout_time)
	{
		this.checkout_time=checkout_time;
	}
	public Date getCheckout_time()
	{
		return this.checkout_time;
	}
	public void setPay_method(Integer pay_method)
	{
		this.pay_method=pay_method;
	}
	public Integer getPay_method()
	{
		return this.pay_method;
	}
	public void setAmount(String amount)
	{
		this.amount=amount;
	}
	public String getAmount()
	{
		return this.amount;
	}
	public void setRemark(String remark)
	{
		this.remark=remark;
	}
	public String getRemark()
	{
		return this.remark;
	}
	public void setPhone(String phone)
	{
		this.phone=phone;
	}
	public String getPhone()
	{
		return this.phone;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return this.address;
	}
	public void setUser_name(String user_name)
	{
		this.user_name=user_name;
	}
	public String getUser_name()
	{
		return this.user_name;
	}
	public void setConsignee(String consignee)
	{
		this.consignee=consignee;
	}
	public String getConsignee()
	{
		return this.consignee;
	}

} 
 