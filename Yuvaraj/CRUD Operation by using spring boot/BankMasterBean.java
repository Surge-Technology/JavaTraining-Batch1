package com.admbsp.bean;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.admbsp.core.util.ScreenNavigation;
import com.admbsp.core.util.AppUtil;
import com.admbsp.dto.BankMasterDTO;
import com.admbsp.dto.BaseDTO;
import com.admbsp.util.BeanUtils;
import com.admbsp.util.HttpService;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;


@Service("bankMasterBean")
@Scope("session")
@Data
@Log4j2
public class BankMasterBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5606220590115315204L;
	
	
	@Autowired
	HttpService httpService;
	
	private final String BANK_MASTER = ScreenNavigation.BANK_MASTER;
	
	
	@Getter
	@Setter
	BankMasterDTO bankMasterdto = new BankMasterDTO();

	@Getter
	@Setter
	List<BankMasterDTO> bankMasterTable = new ArrayList<BankMasterDTO>();

	@Getter
	@Setter
	BankMasterDTO selectView = new BankMasterDTO();

	@Getter
	@Setter
	BankMasterDTO editdis = new BankMasterDTO();

	@Getter
	@Setter
	String serverURL = null;

	@Getter
	@Setter
	private boolean saveButton = true;
	@Getter
	@Setter
	private boolean add = true;
	@Getter
	@Setter
	private boolean showButton = true;
	@Getter
	@Setter
	private boolean view = true;
	@Getter
	@Setter
	private boolean table = false;
	@Getter
	@Setter
	private boolean viewButton = false;
	@Getter
	@Setter
	private boolean addButton = false;
	@Getter
	@Setter
	private boolean modifyButton = false;
	@Getter
	@Setter
	private boolean activeButton = false;
	@Getter
	@Setter
	
	private boolean inActiveButton = false;
	@Getter
	@Setter
	private boolean backButton = false;
	@Getter
	@Setter
	private boolean editBox = true;
	@Getter
	@Setter
	private boolean modifyBox = false;
	
	// SAVE VALIDATION
	public boolean saveValidation() {
		boolean valid = true;
		try {
			if (bankMasterdto.getBankCode() == null || bankMasterdto.getBankCode().trim().isEmpty()) {

				AppUtil.addInfo("Please Enter Bank Code");
				valid = false;
			} else if (bankMasterdto.getBankName() == null
					|| bankMasterdto.getBankName().trim().isEmpty()) {
				AppUtil.addInfo("Please Enter Bank Name");
				valid = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return valid;
	}
	
	// LIST VALIDATION
	public boolean listValidation() {
		boolean listvalid = true;
		try {
			if (selectView == null) {
				AppUtil.addInfo("Please Select Bank Code");

				listvalid = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listvalid;
	}  


	//Active STATUS VALIDATION
		public boolean activeStatusValidation() {
			boolean statusvalid = true;
			try {
				if (selectView.getStatus().equalsIgnoreCase("active")) {
					AppUtil.addInfo(selectView.getBankCode() + " - " + selectView.getBankName()
							+ " Status is already Active");
					statusvalid = false;
				} else if (selectView.getStatus().equalsIgnoreCase("in-active")) {
					AppUtil.addInfo(selectView.getBankCode() + " - " + selectView.getBankName()
							+ " Status is In-Active cannot be set as Active");
					statusvalid = false;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

			return statusvalid;
		}
		
		// InActive STATUS VALIDATION
		public boolean inActiveStatusValidation() {
			boolean statusvalid = true;
			try {
				if (selectView.getStatus().equalsIgnoreCase("in-active")) {

					AppUtil.addInfo(selectView.getBankCode() + " - " + selectView.getBankName()
							+ " Status is already In-Active");

					statusvalid = false;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			return statusvalid;
		}

	// FETCH DATA TABLE LIST 
	public String show() {
		setShowButton(false);
		setSaveButton(false);
		setAdd(false);
		setTable(true);
		setAddButton(true);
		setViewButton(true);
		setView(false);
		setModifyButton(true);
		setActiveButton(true);
		setInActiveButton(true);
		setBackButton(false);
		setEditBox(false);
		setModifyBox(false);
		selectView = new BankMasterDTO();
		list();
		return BANK_MASTER;

	}
	
	// LIST OPERATION
	public void list() {

		serverURL = AppUtil.getPortalServerURL();
		try {
			String url = serverURL + "/bankMasterController/bankMasterShow";
			BaseDTO baseDTO = new BaseDTO();
			baseDTO = httpService.get(url);
			System.out.println(baseDTO);
			if (baseDTO != null) {
				ObjectMapper mapper = new ObjectMapper();
				mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
				System.out.println(baseDTO.getResponseContents());
				String jsonResponse = mapper.writeValueAsString(baseDTO.getResponseContents());
				bankMasterTable = mapper.readValue(jsonResponse, new TypeReference<List<BankMasterDTO>>() {
				});
				
			}
		} catch (JsonProcessingException jpEx) {
			log.error("Json processing exception occured while converting .... ", jpEx);
		} catch (IOException ioEx) {
			log.error("IO Exception occured .... ", ioEx);
		} catch (Exception e) {
			log.error("Exception occured .... ", e);
		}

	}
	
	// ADD VALUES OPERATION
	public String add() {
		
		setShowButton(true);
		setSaveButton(true);
		setAdd(true);
		setTable(false);
		setAddButton(false);
		setView(false);
		setViewButton(false);
		setModifyButton(false);
		setActiveButton(false);
		setInActiveButton(false);
		setBackButton(false);
		setEditBox(true);
		setModifyBox(false);
	
		bankMasterdto = new BankMasterDTO();
		return BANK_MASTER;
	}
	
	// SAVE OPERATION
	public String save() {
		bankMasterdto.setEntityId(BeanUtils.getEntityId());
		bankMasterdto.setLineoffBusinessFK(BeanUtils.getLineOffBusinessFK());
		bankMasterdto.setLastActBy(BeanUtils.getUserId());
		try {
			boolean valid = saveValidation();
			if (valid == true) {
			
					serverURL = AppUtil.getPortalServerURL();
					String url = serverURL + "/bankMasterController/bankMasterSave";
					BaseDTO baseDTO = httpService.post(url, bankMasterdto);
	
					if (baseDTO.getResponseContent().toString().equalsIgnoreCase("successful")) {
						AppUtil.addInfo("Saved Successfully");
						show();
						setEditBox(true);
						setModifyBox(false);
						bankMasterdto = new BankMasterDTO();
						return BANK_MASTER;
					} else {
						AppUtil.addInfo("bank Code should be Unique");
						bankMasterdto.setBankCode(null);
						return BANK_MASTER;
	
					}
			}
			
		} catch (Exception e) {
			log.info("Exception occured while Saving Bank Master....... ", e);
			return null;
		}
		return null;
	}
	
	// MODIFY OPERATION
	public String modify() {

		try {

			boolean valid = listValidation();
			if (valid == true) {
				if (selectView.getStatus().equalsIgnoreCase("in-active")) {
					AppUtil.addInfo(selectView.getBankCode() + " - " + selectView.getBankName()
							+ " Status is In-Active it cannot be Modified");

				} else {
					setSaveButton(true);
					setAdd(true);
					setShowButton(true);
					setView(false);
					setModifyButton(false);
					setAddButton(false);
					setViewButton(false);
					setTable(false);
					setActiveButton(false);
					setInActiveButton(false);
					setBackButton(false);
					setEditBox(false);
					setModifyBox(true);
					BaseDTO baseDTO = null;

					serverURL = AppUtil.getPortalServerURL();

					String urls = serverURL + "/bankMasterController/bankMasterView/"
							+ selectView.getBankMasterPK();
					baseDTO = httpService.get(urls);
					ObjectMapper mapper = new ObjectMapper();
					String jsonResponse = mapper.writeValueAsString(baseDTO.getResponseContent());
					bankMasterdto = mapper.readValue(jsonResponse, new TypeReference<BankMasterDTO>() {
					});
					return BANK_MASTER;
				}
			}

		} catch (Exception e) {

			log.error("Error while goto Edit Page" + e);
			return null;
		}
		return null;

	}
	
	// VIEW OPERATION
	public String view() {

		try {

			boolean valid = listValidation();
			if (valid == true) {
				setBackButton(true);
				setTable(false);
				setView(true);
				setModifyButton(false);
				setViewButton(false);
				setShowButton(false);
				setSaveButton(false);
				setAdd(false);
				setAddButton(false);
				BaseDTO baseDTO = null;
				setActiveButton(false);
				setInActiveButton(false);
				serverURL = AppUtil.getPortalServerURL();

				String urls = serverURL + "/bankMasterController/bankMasterView/"
						+ selectView.getBankMasterPK();
				baseDTO = httpService.get(urls);
				ObjectMapper mapper = new ObjectMapper();
				String jsonResponse = mapper.writeValueAsString(baseDTO.getResponseContent());

				editdis = mapper.readValue(jsonResponse, new TypeReference<BankMasterDTO>() {
				});
				
				return BANK_MASTER;

			}
		} catch (Exception e) {

			log.error("Error while goto Edit Page" + e);
			return null;
		}
		return null;

	}
	
	// Active Operation
	public String active() {
		try {

			boolean valid = listValidation();
			if (valid == true) {
				serverURL = AppUtil.getPortalServerURL();

				boolean status_valid = activeStatusValidation();
				if (status_valid == true) {
					String urls = serverURL + "/bankMasterController/bankMasterStatus";
					selectView.setStatus("Active");
					selectView.setEntityId(BeanUtils.getEntityId());
					selectView.setLastActBy(BeanUtils.getUserId());
					selectView.setLineoffBusinessFK(BeanUtils.getLineOffBusinessFK());
					BaseDTO baseDTO = httpService.post(urls, selectView);
					AppUtil.addInfo(selectView.getBankCode() + " - " + selectView.getBankName()
							+ " Status has been Updated Successfully");
					show();

					return BANK_MASTER;
				}
			}
		} catch (Exception e) {

			log.error("Error while goto Active Page" + e);
			return null;
		}
		return null;

	}
	
	// InActive Operation
	public String inactive() {
		try {

			boolean valid = listValidation();
			if (valid == true) {
				boolean status_valid = inActiveStatusValidation();
				if (status_valid == true) {
					serverURL = AppUtil.getPortalServerURL();
					String urls = serverURL + "/bankMasterController/bankMasterStatus";
					selectView.setStatus("In-Active");
					selectView.setEntityId(BeanUtils.getEntityId());
					selectView.setLastActBy(BeanUtils.getUserId());
					selectView.setLineoffBusinessFK(BeanUtils.getLineOffBusinessFK());
					BaseDTO baseDTO = httpService.post(urls, selectView);
					AppUtil.addInfo(selectView.getBankCode() + " - " + selectView.getBankName()
							+ " Status has been Updated Successfully");
					show();
					return BANK_MASTER;

				}
			}
		} catch (Exception e) {

			log.error("Error while goto Active Page" + e);
			return null;
		}
		return null;

	}
	
	//BACK OPERATION
	public String back() {
		show();
		return BANK_MASTER;
	}

	//CLEAR OPERATION
	public String clear() {
		if (bankMasterdto.getBankMasterPK() == 0) {
			bankMasterdto = new BankMasterDTO();
		} else {

			bankMasterdto.setBankName(null);
			bankMasterdto.setUrl(null);
			bankMasterdto.setApiKey(null);

		}

		return BANK_MASTER;

	}

}
