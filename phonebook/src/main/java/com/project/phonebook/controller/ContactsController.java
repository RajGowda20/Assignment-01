package com.project.phonebook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.project.phonebook.service.PhoneBookService;

@Controller
public class ContactsController {

	@Autowired
	private PhoneBookService phoneBookService;
	
	@GetMapping("/search")
	public String indexContact() {

		return "index";
	}

	@GetMapping( value = "/contactNamesAutocomplete")
	@ResponseBody
	public List<String> searchContact(@RequestParam(value = "term", required = false, defaultValue = "") String term) {
		
		return phoneBookService.searchContact(term);
	}
}
