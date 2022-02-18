package com.sample.Bank.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sample.Bank.Entity.BankDetails;
import com.sample.Bank.Repository.BankRepository;

@Service
public class BankService {
	
@Autowired
	BankRepository repository;

public BankDetails save(BankDetails bankdetails) {
	return repository.save(bankdetails);
}

public List<BankDetails> saveAll(List<BankDetails> listofbankdetails){
	return repository.saveAll(listofbankdetails);
}
public Optional<BankDetails> getDetail(Integer id) {
	System.out.println("in repo...");
	return repository.findById(id);
}
public List<BankDetails> allDetails(){
	return repository.findAll();
	
}
public void delete(Integer id) {
	repository.deleteById(id);
}
public void update(BankDetails bankdetails) {
	repository.save(bankdetails);
}

}


