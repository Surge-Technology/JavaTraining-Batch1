package com.surge.vms.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.surge.vms.model.PurchaseOrderItemList;
import com.surge.vms.model.Vendor;
import com.surge.vms.model.VendorCompany;

@Repository
public interface PurchaseOrderListRepository extends CrudRepository<PurchaseOrderItemList, Long> {



}
