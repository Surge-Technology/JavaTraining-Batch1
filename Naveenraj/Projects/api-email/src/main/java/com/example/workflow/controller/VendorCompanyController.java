package com.example.workflow.controller;





import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;



import com.example.workflow.entity.PurchaseOrderItemList;
import com.example.workflow.service.VendorCompanyService;


@RestController
/*
 * @Validated
 * 
 * @CrossOrigin(origins = "*", allowedHeaders = "*")
 */
public class VendorCompanyController {

	@Autowired
	private VendorCompanyService vendorCompanyService;


	
	@PostMapping("/vendorcompanyreg/purchaseOrderData")
	ResponseEntity<String> dummyApi(@RequestPart("action") PurchaseOrderItemList poi,
	@RequestPart("resources") MultipartFile[] uploadfiles)
	 {
	vendorCompanyService.addPurchaseOrderList(poi);
	System.out.println(poi);



	return new ResponseEntity<String>("", HttpStatus.OK);
	 }
	
	 @PostMapping
	    public ResponseEntity<PurchaseOrderItemList> addPurchaseOrderList(@RequestBody PurchaseOrderItemList poi)
	                                                   {
		 PurchaseOrderItemList updated = vendorCompanyService.addPurchaseOrderList(poi);
	        return new ResponseEntity<PurchaseOrderItemList>(updated, new HttpHeaders(), HttpStatus.CREATED);
	    }
	}