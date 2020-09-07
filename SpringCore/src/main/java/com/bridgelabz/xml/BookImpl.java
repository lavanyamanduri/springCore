package com.bridgelabz.xml;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BookImpl implements BookService {

	
	@Autowired
	private BookRepo repo;
	
	@Override
	public List<BookEntity> getBooks() {
		
		return repo.findAll();
	}

}
