package com.example.workflow.service;

import java.util.List;

import com.example.workflow.entity.PurchaseOrderItemList;

public interface VendorCompanyService  {

	 public PurchaseOrderItemList addPurchaseOrderList(PurchaseOrderItemList newCompany);
	 
	    
	    public List< PurchaseOrderItemList> getAllPOorder();



	    public List<PurchaseOrderItemList> getAllVendorCompanyByStatuspo(String status);
	    public void updatePurchaseOrderStatus(Long id, String pONewStatus);
}
