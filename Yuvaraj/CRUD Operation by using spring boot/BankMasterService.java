package com.admbsp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admbsp.core.util.ErrorDescription;
import com.admbsp.core.util.RestException;
import com.admbsp.dto.BankMasterDTO;
import com.admbsp.dto.BaseDTO;
import com.admbsp.entity.MST_BANK_HIB;
import com.admbsp.entity.MST_USER_HIB;
import com.admbsp.repository.MST_BANK_REPOSITORY;
import com.admbsp.repository.MST_USER_REPOSITORY;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class BankMasterService {
	
	@Autowired
	MST_BANK_REPOSITORY mST_BANK_REPOSITORY;
	
	/*
	 * @Autowired MST_USER_REG_REPOSITORY mST_USER_REG_REPOSITORY;
	 */
	
	 @Autowired 
	 MST_USER_REPOSITORY mST_USER_REPOSITORY;
	
	
	public BaseDTO bankMasterSave(BankMasterDTO bankMasterdto) {
		BaseDTO response = new BaseDTO();
		
		try {
			
			if(mST_BANK_REPOSITORY.findDup(bankMasterdto.getBankCode()) == null || bankMasterdto.getBankMasterPK() != 0) {
				MST_BANK_HIB mST_BANK_HIB = new MST_BANK_HIB();
				
				mST_BANK_HIB.setMB_BANK_PK(bankMasterdto.getBankMasterPK());
				mST_BANK_HIB.setMB_AEN_ENT_FK(bankMasterdto.getEntityId());
				mST_BANK_HIB.setMB_ALB_LINEOFF_BUSINESS_FK(bankMasterdto.getLineoffBusinessFK());
				mST_BANK_HIB.setMB_BANK_CODE(bankMasterdto.getBankCode());
				mST_BANK_HIB.setMB_BANK_NAME(bankMasterdto.getBankName());
				mST_BANK_HIB.setMB_BANK_URL_LINK(bankMasterdto.getUrl());
				mST_BANK_HIB.setMB_BANK_API_KEY(bankMasterdto.getApiKey());
				
				if((bankMasterdto.getStatus() == null)) {
					mST_BANK_HIB.setMB_STATUS("C");
				}
				else if(bankMasterdto.getStatus().equalsIgnoreCase("active")){
					mST_BANK_HIB.setMB_STATUS("A");
				}else if(bankMasterdto.getStatus().equalsIgnoreCase("Created")) {
					mST_BANK_HIB.setMB_STATUS("C");
				}
				
				mST_BANK_HIB.setMB_LAST_ACT_BY(bankMasterdto.getLastActBy());
				
				if(bankMasterdto.getLastActDate() == null) {
					mST_BANK_HIB.setMB_LAST_ACT_DATE(new Date());
				}else {
					mST_BANK_HIB.setMB_LAST_ACT_DATE(bankMasterdto.getLastActDate());
				}
				
				mST_BANK_REPOSITORY.save(mST_BANK_HIB);
				response.setResponseContent("Successful");
				response.setStatusCode(ErrorDescription.SUCCESS_RESPONSE.getErrorCode());
				
			}else {
				response.setResponseContent("Unsuccessful");
			}
			
		} catch (RestException exception) {

			response.setStatusCode(exception.getStatusCode());

		}
		
		return response;
		
	}
	
	public BaseDTO bankMasterShow() {
		
		  BaseDTO response = new BaseDTO();
		  
		  List<MST_BANK_HIB> bankMasterList = new ArrayList<>();
		  
		  List<BankMasterDTO> bankMasterDTOList= new ArrayList<>();
		  
		  try {
			  
			  bankMasterList = mST_BANK_REPOSITORY.orderBy();
			  
			  if (null != bankMasterList) {
				  
				  
				  for(MST_BANK_HIB bM : bankMasterList) {
					  BankMasterDTO bMDto = new BankMasterDTO();
					  bMDto.setBankMasterPK(bM.getMB_BANK_PK());
					  bMDto.setEntityId(bM.getMB_AEN_ENT_FK());
					  bMDto.setLineoffBusinessFK(bM.getMB_ALB_LINEOFF_BUSINESS_FK());
					  bMDto.setBankCode(bM.getMB_BANK_CODE());
					  bMDto.setBankName(bM.getMB_BANK_NAME());
					  bMDto.setApiKey(bM.getMB_BANK_API_KEY());
					  bMDto.setUrl(bM.getMB_BANK_URL_LINK());
					  
					  if(bM.getMB_STATUS() == null) {
						  bMDto.setStatus(bM.getMB_STATUS());
					  }else if(bM.getMB_STATUS().equalsIgnoreCase("i")) {
						  bMDto.setStatus("In-Active");
					  }else if(bM.getMB_STATUS().equalsIgnoreCase("a")) {
						  bMDto.setStatus("Active");
					  }else if(bM.getMB_STATUS().equalsIgnoreCase("c")) {
						  bMDto.setStatus("Created");
					  }
					  
					  //MST_USER_REG_HIB mST_USER_REG_HIB = mST_USER_REG_REPOSITORY.findLastActBy(bM.getMB_LAST_ACT_BY());
					  MST_USER_HIB mST_USER_HIB = mST_USER_REPOSITORY.getUser(bM.getMB_LAST_ACT_BY());
					  
					  if(mST_USER_HIB == null) {
						  bMDto.setLastActByName(null);
					  }else {
						  bMDto.setLastActByName(mST_USER_HIB.getMU_USER_NAME());
					  }
					  
					  bMDto.setLastActDate(bM.getMB_LAST_ACT_DATE());
					  
					  bankMasterDTOList.add(bMDto);
					  
				  }
				  
			  }
			  
			  response.setStatusCode(ErrorDescription.ROLE_LIST_RETRIEVED.getErrorCode());
			  response.setResponseContents(bankMasterDTOList);
			  log.info("<----Bank Details fetched Successfully, No of records-->"
						+ bankMasterDTOList.size());
		
		  } 
		  catch (RestException re) { 
			  log.warn("Error while get All role=====", re);
			  response.setStatusCode(re.getStatusCode()); 
		  } 
		  catch (Exception e) {
		  log.error("Exception Occured ===>>", e); 
		  }
		  log.info("<<<< ------- BankMaster Details ---------- >>>>>>>");
		  
		  
		  
		  
		  return response;
	}
	
	public BaseDTO bankMasterView(int bankMasterPK) {
		BaseDTO response = new BaseDTO();
		
		BankMasterDTO bankMasterDTO = new BankMasterDTO();
		
		try {
			
			MST_BANK_HIB mST_BANK_HIB = mST_BANK_REPOSITORY.findOne(bankMasterPK);
			
			bankMasterDTO.setBankMasterPK(mST_BANK_HIB.getMB_BANK_PK());
			bankMasterDTO.setEntityId(mST_BANK_HIB.getMB_AEN_ENT_FK());
			bankMasterDTO.setLineoffBusinessFK(mST_BANK_HIB.getMB_ALB_LINEOFF_BUSINESS_FK());
			bankMasterDTO.setBankCode(mST_BANK_HIB.getMB_BANK_CODE());
			bankMasterDTO.setBankName(mST_BANK_HIB.getMB_BANK_NAME());
			bankMasterDTO.setApiKey(mST_BANK_HIB.getMB_BANK_API_KEY());
			bankMasterDTO.setUrl(mST_BANK_HIB.getMB_BANK_URL_LINK());
			bankMasterDTO.setLastActBy(mST_BANK_HIB.getMB_LAST_ACT_BY());
			
			//MST_USER_REG_HIB mST_USER_REG_HIB = mST_USER_REG_REPOSITORY.findLastActBy(mST_BANK_HIB.getMB_LAST_ACT_BY());	
			MST_USER_HIB mST_USER_HIB = mST_USER_REPOSITORY.getUser(mST_BANK_HIB.getMB_LAST_ACT_BY());
			if(mST_USER_HIB == null) {
				bankMasterDTO.setLastActByName(null);
			}else {
				bankMasterDTO.setLastActByName(mST_USER_HIB.getMU_USER_NAME());
			}
			
			if(mST_BANK_HIB.getMB_STATUS() == null) {
				bankMasterDTO.setStatus(mST_BANK_HIB.getMB_STATUS());
			}else if(mST_BANK_HIB.getMB_STATUS().equalsIgnoreCase("i")) {
				bankMasterDTO.setStatus("In-Active");
			}else if(mST_BANK_HIB.getMB_STATUS().equalsIgnoreCase("a")) {
				bankMasterDTO.setStatus("Active");
			}else if(mST_BANK_HIB.getMB_STATUS().equalsIgnoreCase("c")) {
				bankMasterDTO.setStatus("Created");
			}
			
			bankMasterDTO.setLastActDate(mST_BANK_HIB.getMB_LAST_ACT_DATE());
			response.setStatusCode(ErrorDescription.ROLE_LIST_RETRIEVED.getErrorCode());
			response.setResponseContent(bankMasterDTO);
	
		} catch (RestException re) {
			log.warn("Error while get All role=====", re);
			response.setStatusCode(re.getStatusCode());
		} catch (Exception e) {
			log.error("Exception Occured ===>>", e);
		}
		log.info("<<<< ------- Bank Master Details ---------- >>>>>>>");
		
		return response;
	}
	
	public BaseDTO bankMasterStatus(BankMasterDTO selectView) {
		
		BaseDTO response = new BaseDTO();
		
		try {
			
			MST_BANK_HIB mST_BANK_HIB = new MST_BANK_HIB();
			
			mST_BANK_HIB.setMB_BANK_PK(selectView.getBankMasterPK());
			mST_BANK_HIB.setMB_AEN_ENT_FK(selectView.getEntityId());
			mST_BANK_HIB.setMB_ALB_LINEOFF_BUSINESS_FK(selectView.getLineoffBusinessFK());
			mST_BANK_HIB.setMB_BANK_CODE(selectView.getBankCode());
			mST_BANK_HIB.setMB_BANK_NAME(selectView.getBankName());
			mST_BANK_HIB.setMB_BANK_API_KEY(selectView.getApiKey());
			mST_BANK_HIB.setMB_BANK_URL_LINK(selectView.getUrl());
			
			if(selectView.getStatus().equalsIgnoreCase("active")) {
				mST_BANK_HIB.setMB_STATUS("A");
			}else if(selectView.getStatus().equalsIgnoreCase("In-active")) {
				mST_BANK_HIB.setMB_STATUS("I");
			}
			mST_BANK_HIB.setMB_LAST_ACT_BY(selectView.getLastActBy());
			mST_BANK_HIB.setMB_LAST_ACT_DATE(selectView.getLastActDate());
		
			mST_BANK_REPOSITORY.save(mST_BANK_HIB);
			response.setStatusCode(ErrorDescription.SUCCESS_RESPONSE.getErrorCode());
		} catch (RestException exception) {

			response.setStatusCode(exception.getStatusCode());

		}
		
		return response;
		
	}
	
	

}
