package com.ret.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ret.demo.model.Address;

public interface AddressRepo extends JpaRepository<Address,Long>{

}
