package com.learn.microservices.reading.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.microservices.reading.service.BookService;

@RestController
public class ReadingController {

	@Autowired
	private BookService bookService;

	@RequestMapping("/to-read")
	public String readingList() {
		return bookService.readingList();
	}

}
