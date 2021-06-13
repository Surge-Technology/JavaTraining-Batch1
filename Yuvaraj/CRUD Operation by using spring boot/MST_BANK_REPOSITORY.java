package com.admbsp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.admbsp.entity.MST_BANK_HIB;

public interface MST_BANK_REPOSITORY extends JpaRepository<MST_BANK_HIB, Integer> {

	@Query("select r from MST_BANK_HIB r where r.mB_STATUS = 'A' order by r.mB_BANK_NAME asc")
	List<MST_BANK_HIB> retrieveAllActiveBanks();
	
	@Query("select m from MST_BANK_HIB m order by mB_BANK_PK desc")
	List<MST_BANK_HIB> orderBy();
	
	@Query("select m from MST_BANK_HIB m where mB_BANK_CODE=?1")
	MST_BANK_HIB findDup(String bankCode);
	
	@Query("select r from MST_BANK_HIB r where r.mB_BANK_PK = ?1")
	MST_BANK_HIB retrieveBank(int mB_BANK_PK);
	
	@Query("select r from MST_BANK_HIB r where r.mB_STATUS ='A' AND r.mB_BANK_NAME = ?1")
	MST_BANK_HIB retrieveBank(String bankName);
	
}
