package com.project.phonebook.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.phonebook.entity.PhoneDirectory;
import com.project.phonebook.repository.PhoneRepository;

@Service
public class PhoneBookServiceImpl implements PhoneBookService {

	@Autowired
	private PhoneRepository phoneRepository;

	@Override
	public List<String> searchContact(String name) {

		/*
		 * Due to Shortage of time, hard-coding the values instead of fetching from DB
		 */
//		List<PhoneDirectory> contacts = phoneRepository.findAll();
		List<PhoneDirectory> staticContacts = new ArrayList<>();
		staticContacts.add(new PhoneDirectory(1l, "Ram", true));
		staticContacts.add(new PhoneDirectory(2l, "Govindha", true));
		staticContacts.add(new PhoneDirectory(3l, "Hanuman", true));
		staticContacts.add(new PhoneDirectory(4l, "Seetha", true));
		staticContacts.add(new PhoneDirectory(5l, "Ganesh", true));
		staticContacts.add(new PhoneDirectory(6l, "Gowri", true));
		staticContacts.add(new PhoneDirectory(7l, "Suresh", true));
		staticContacts.add(new PhoneDirectory(8l, "Ramesh", true));
		staticContacts.add(new PhoneDirectory(9l, "Bhavya", true));
		staticContacts.add(new PhoneDirectory(10l, "Bharat", true));
		staticContacts.add(new PhoneDirectory(11l, "Superman", true));
		staticContacts.add(new PhoneDirectory(12l, "Avenegers", true));
		staticContacts.add(new PhoneDirectory(13l, "Bahubali", true));
		staticContacts.add(new PhoneDirectory(14l, "Bholenath", true));
		staticContacts.add(new PhoneDirectory(15l, "Zingy", true));
		staticContacts.add(new PhoneDirectory(16l, "Tangy", true));


		List<String> matched = staticContacts.stream().filter(e -> e.getName().toLowerCase().contains(name.toLowerCase()))
				.map(f->f.getName())
				.collect(Collectors.toList());

		return matched;
	}

}
