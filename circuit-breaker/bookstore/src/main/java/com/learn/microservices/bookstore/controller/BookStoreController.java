package com.learn.microservices.bookstore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookStoreController {
	@RequestMapping("/recommended")
	public String readingList() {
		return "Spring in Action (Manning), Cloud Native Java (O'Reilly)";
	}

}
