package com.my.waimai.entity;


import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
  自增主键: 无
*/ 

@Data
public class Orders  implements Serializable
{
	private static final long serialVersionUID = 1L;
	private Long id ;
	private String number ;
	private Integer status ;
	private Long userId;
	private Long addressBookId;
	private LocalDateTime orderTime;

	private LocalDateTime checkoutTime;
	private Integer payMethod;
	private String amount ;
	private String remark ;
	private String phone ;
	private String address ;
	private String userName;
	private String consignee ;


} 
 