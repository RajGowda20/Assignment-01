package com.project.phonebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.phonebook.entity.PhoneDirectory;

@Repository
public interface PhoneRepository extends JpaRepository<PhoneDirectory, Long>{
	

}
