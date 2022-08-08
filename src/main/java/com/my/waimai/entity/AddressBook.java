package com.my.waimai.entity;


import java.util.Date; 


/**
  自增主键: 无
*/ 


public class AddressBook 
{ 
 
	private Long id ;
	private Long userId;
	private String consignee ;
	private Byte sex ;
	private String phone ;
	private String provinceCode;
	private String provinceName;
	private String cityCode;
	private String cityName;
	private String districtCode;
	private String districtName;
	private String detail ;
	private String label ;
	private Boolean isDefault;
	private Date createTime;
	private Date updateTime;
	private Long createUser;
	private Long updateUser;
	private Integer isDeleted;


	public void setId(Long id)
	{
		this.id=id;
	}
	public Long getId()
	{
		return this.id;
	}
	public void setUserId(Long userId)
	{
		this.userId = userId;
	}
	public Long getUserId()
	{
		return this.userId;
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
	public void setProvinceCode(String provinceCode)
	{
		this.provinceCode = provinceCode;
	}
	public String getProvinceCode()
	{
		return this.provinceCode;
	}
	public void setProvinceName(String provinceName)
	{
		this.provinceName = provinceName;
	}
	public String getProvinceName()
	{
		return this.provinceName;
	}
	public void setCityCode(String cityCode)
	{
		this.cityCode = cityCode;
	}
	public String getCityCode()
	{
		return this.cityCode;
	}
	public void setCityName(String cityName)
	{
		this.cityName = cityName;
	}
	public String getCityName()
	{
		return this.cityName;
	}
	public void setDistrictCode(String districtCode)
	{
		this.districtCode = districtCode;
	}
	public String getDistrictCode()
	{
		return this.districtCode;
	}
	public void setDistrictName(String districtName)
	{
		this.districtName = districtName;
	}
	public String getDistrictName()
	{
		return this.districtName;
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
	public void setIsDefault(Boolean isDefault)
	{
		this.isDefault = isDefault;
	}
	public Boolean getIsDefault()
	{
		return this.isDefault;
	}
	public void setCreateTime(Date createTime)
	{
		this.createTime = createTime;
	}
	public Date getCreateTime()
	{
		return this.createTime;
	}
	public void setUpdateTime(Date updateTime)
	{
		this.updateTime = updateTime;
	}
	public Date getUpdateTime()
	{
		return this.updateTime;
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
	public void setIsDeleted(Integer isDeleted)
	{
		this.isDeleted = isDeleted;
	}
	public Integer getIsDeleted()
	{
		return this.isDeleted;
	}

} 
 