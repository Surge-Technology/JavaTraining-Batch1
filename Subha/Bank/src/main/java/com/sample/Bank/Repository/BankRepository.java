package com.sample.Bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.Bank.Entity.BankDetails;
@Repository

public interface BankRepository extends JpaRepository<BankDetails, Integer>{

}
