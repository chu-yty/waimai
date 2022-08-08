package com.my.waimai.entity;

import java.util.Date; 

/**
  自增主键: 无
*/ 


public class Orders 
{ 
 
	private Long id ;
	private String number ;
	private Integer status ;
	private Long userId;
	private Long addressBookId;
	private Date orderTime;
	private Date checkoutTime;
	private Integer payMethod;
	private String amount ;
	private String remark ;
	private String phone ;
	private String address ;
	private String userName;
	private String consignee ;


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
	public void setUserId(Long userId)
	{
		this.userId = userId;
	}
	public Long getUserId()
	{
		return this.userId;
	}
	public void setAddressBookId(Long addressBookId)
	{
		this.addressBookId = addressBookId;
	}
	public Long getAddressBookId()
	{
		return this.addressBookId;
	}
	public void setOrderTime(Date orderTime)
	{
		this.orderTime = orderTime;
	}
	public Date getOrderTime()
	{
		return this.orderTime;
	}
	public void setCheckoutTime(Date checkoutTime)
	{
		this.checkoutTime = checkoutTime;
	}
	public Date getCheckoutTime()
	{
		return this.checkoutTime;
	}
	public void setPayMethod(Integer payMethod)
	{
		this.payMethod = payMethod;
	}
	public Integer getPayMethod()
	{
		return this.payMethod;
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
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getUserName()
	{
		return this.userName;
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
 