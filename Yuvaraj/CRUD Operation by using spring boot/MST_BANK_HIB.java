package com.admbsp.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "MST_BANK" , schema = "dbo")
public class MST_BANK_HIB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8507152660882925277L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MB_BANK_PK", updatable = false)
	private int mB_BANK_PK;


	@Column(name = "MB_AEN_ENT_FK")
	private int mB_AEN_ENT_FK;
	
	@Column(name = "MB_ALB_LINEOFF_BUSINESS_FK")
	private int mB_ALB_LINEOFF_BUSINESS_FK;
	
	@Column(name = "MB_BANK_CODE")
	private String mB_BANK_CODE;
	
	@Column(name = "MB_BANK_NAME")
	private String mB_BANK_NAME;
	
	@Column(name = "MB_BANK_API_KEY")
	private String mB_BANK_API_KEY;
	
	@Column(name = "MB_BANK_URL_LINK")
	private String mB_BANK_URL_LINK;
	
	@Column(name = "MB_STATUS")
	private String mB_STATUS;
	
	@Column(name = "MB_LAST_ACT_BY")
	private int mB_LAST_ACT_BY;
	
	@Column(name = "MB_LAST_ACT_DATE")
	private Date mB_LAST_ACT_DATE;
}
