package com.example.crud.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.example.crud.Entity.EmpTable;

@Repository
	public interface EmpTableRepo extends JpaRepository<EmpTable,Long> {
	


}
