package com.sample.Bank.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.Bank.Entity.BankDetails;
import com.sample.Bank.Service.BankService;

@RestController
public class DetailsController {

	@Autowired
	BankService service;
	
	@PostMapping("/details")
	public ResponseEntity<String> addDetails(@RequestBody BankDetails bankdetails) {

		int empId = bankdetails.getId();

		System.out.println("EMP ID received from postman:" + empId);

		Optional<BankDetails> bankDetailFromDB = service.getDetail(empId);

		if (bankDetailFromDB.isEmpty()) {

			service.save(bankdetails);

			return new ResponseEntity<String>("BankDetail Created Successfully", HttpStatus.OK);

		} else {
			return new ResponseEntity<String>("BankDetail Already Existing Successfully", HttpStatus.OK);
		}

	}
@PostMapping("/alldetails")
	public Optional<List<BankDetails>> addAllDetails(@RequestBody List<BankDetails> listofbankdetails){
	 
		return Optional.of(service.saveAll(listofbankdetails));
		
	}
@GetMapping("/details")
public List<BankDetails>details(){
	return service.allDetails();	
}
@GetMapping("/detail/{id}")
public Optional<BankDetails>  getBankDetail(@PathVariable Integer id) {
	System.out.println("entered contoller..");
	System.out.println("entered contoller.."+id);
	return service.getDetail(id);
	
}
@DeleteMapping("/detail/{id}")
public void deleteDetail(@PathVariable Integer id) {
	service.delete(id);
}
@PutMapping("/detail")
public void updateDetail(@RequestBody BankDetails bankdetails) {
	service.update(bankdetails);
}
@DeleteMapping("/details/{id}")
	public ResponseEntity<String> delDetails(@PathVariable Integer id,BankDetails bankdetails) {
	int delId=bankdetails.getId();
	System.out.println("EMP ID received from postman:" +delId);
	Optional<BankDetails> bankDetailFromDB = service.getDetail(delId);
	if(bankDetailFromDB.isEmpty()) {
		return new ResponseEntity<String>("Id doesnot exist",HttpStatus.OK);
	}else
	{
		   service.delete(id);
		return new ResponseEntity<String>("Id deleted succesully",HttpStatus.OK);
	}
	
}
}
