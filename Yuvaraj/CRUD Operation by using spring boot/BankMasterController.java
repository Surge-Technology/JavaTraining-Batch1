package com.admbsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.admbsp.dto.BankMasterDTO;
import com.admbsp.dto.BaseDTO;
import com.admbsp.service.BankMasterService;




@RestController
@RequestMapping("/bankMasterController")
public class BankMasterController {
	
	@Autowired
	BankMasterService bankMasterService;
	
	@RequestMapping(value = "/bankMasterSave", method = RequestMethod.POST)
	public BaseDTO bankMasterSave(@RequestBody BankMasterDTO bankMasterDTO) {
		
		return bankMasterService.bankMasterSave(bankMasterDTO);
		
	}
	

	@RequestMapping(value = "/bankMasterShow", method = RequestMethod.GET)
	public BaseDTO bankMasterShow() {
		
		return bankMasterService.bankMasterShow();
		
	}

	@RequestMapping(value = "/bankMasterView/{bankMasterPK}", method = RequestMethod.GET)
	public BaseDTO bankMasterView(@PathVariable int bankMasterPK) {
		return bankMasterService.bankMasterView(bankMasterPK);
	}
	

	@RequestMapping(value = "/bankMasterStatus", method = RequestMethod.POST)
	public BaseDTO bankMasterStatus(@RequestBody BankMasterDTO selectView) {
		return bankMasterService.bankMasterStatus(selectView);
	}

}
