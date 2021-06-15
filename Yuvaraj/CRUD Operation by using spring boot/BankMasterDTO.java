package com.admbsp.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class BankMasterDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4627782374692279434L;
	
	
	private int bankMasterPK;
	
	private int entityId;

	private int lineoffBusinessFK;
	
	private String bankCode;
	
	private String bankName;
	
	private String apiKey;
	
	private String url;

	private String status;
	
	private int lastActBy;
	
	private String lastActByName;
	
	private Date lastActDate;

}
