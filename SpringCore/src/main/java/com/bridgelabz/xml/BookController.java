package com.bridgelabz.xml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	
	@Autowired
	private BookService service;
	
	@GetMapping("/getBook")
	public List<BookEntity> list() {
	    return service.getBooks();
	}
	
}
