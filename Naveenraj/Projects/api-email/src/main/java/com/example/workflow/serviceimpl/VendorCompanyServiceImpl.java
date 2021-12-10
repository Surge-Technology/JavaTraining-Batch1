package com.example.workflow.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workflow.repository.PurchaseOrderListRepository;
import com.example.workflow.service.VendorCompanyService;
import com.example.workflow.entity.PurchaseOrderItemList;
import com.example.workflow.repository.PurchaseOrderListRepository;

@Service
public class VendorCompanyServiceImpl implements VendorCompanyService {

	@Autowired
	private PurchaseOrderListRepository poorderrepo;
	
	

	@Override
	public PurchaseOrderItemList addPurchaseOrderList(PurchaseOrderItemList newCompany) {
	PurchaseOrderItemList poi = poorderrepo.save(newCompany);
	return poi;
	
	
	}

	
	

    @Override
    public List<PurchaseOrderItemList> getAllPOorder() {
        // TODO Auto-generated method stub
        List<PurchaseOrderItemList> list = new ArrayList<>();
        poorderrepo.findAll().forEach(e -> list.add(e));

        return list;
    }
	
	
		



	@Override
	public List<PurchaseOrderItemList> getAllVendorCompanyByStatuspo(String status) {
		// TODO Auto-generated method stub
		List<PurchaseOrderItemList> poList = getAllPOorder();

		List<PurchaseOrderItemList> filteredList = new ArrayList<PurchaseOrderItemList>();

		for (PurchaseOrderItemList vc : poList) {
		if (vc.getPoStatus().equalsIgnoreCase(status)) {
		System.out.println(status);
		filteredList.add(vc);
		}


		}
		return filteredList;
		
	}

	@Override
	public void updatePurchaseOrderStatus(Long id, String pONewStatus) {
			
		Optional<PurchaseOrderItemList> purchaseOrder = poorderrepo.findById(id).map(x -> {
           
            x.setPoStatus(pONewStatus);
            return poorderrepo.save(x);
        });
	}
	
	
}