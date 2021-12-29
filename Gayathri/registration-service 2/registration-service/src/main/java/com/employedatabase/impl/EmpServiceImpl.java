package com.employedatabase.impl;


import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employedatabase.entity.Address;
import com.employedatabase.entity.Emp;
import com.employedatabase.repository.EmpRepository;
import com.employedatabase.service.EmpService;
@Transactional
@Service("EmpServiceImpl")
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpRepository empRepository;

	/*
	 * public Book saveBook(Book book) {
	 * 
	 * Story story = book.getStory(); 
	 * story.setBook(book); book = bookRepository.save(book);
	 *  return book;
	 * 
	 * }
	 */
	
	public Emp saveEmp(Emp emp) {
		Address address = emp.getAddress();
		address.setEmp(emp);
		emp = empRepository.save(emp);
		return emp;

		
	}

	public Emp findByEmpId(int empId) {
		Emp emp = empRepository.findByEmpId(empId);
		return emp;
	}
	
	

	/*
	 * public Book deleteByBookId(int bookId) { Book book =
	 * bookRepository.deleteByBookId(bookId); return book; }
	 */
	

	
	
 
}