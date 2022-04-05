package com.company.university;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.company.university.beans.University;
import com.company.university.controller.UniversityController;
import com.company.university.repo.UniversityRepository;
import com.company.university.service.UniversityService;



@SpringBootTest
class UniversityServiceApplicationTests {
	@Autowired
	private UniversityService service;

	@Autowired
	private UniversityController controller;

	@MockBean
	private UniversityRepository repo;

	@BeforeEach
	public void setUp() {
		Optional<University> University = Optional
				.of(new University(9000,"chet","12345","Chetan","Sapient","chetan@gmail.com","9911567356","Good","Java Full Stack",68));
		
		
		List<University> list = Arrays
				.asList(new University(9000,"chet","12345","Chetan","Sapient","chetan@gmail.com","9911567356","Good","Java Full Stack",68));
		
		
		Optional<University> emptyUniversity = Optional.empty();
		
		when(repo.findById(1)).thenReturn(University);
		when(repo.findById(11111)).thenReturn(emptyUniversity);
		when(repo.findAll()).thenReturn(list);
		when(repo.insert(University.get())).thenReturn(University.get());

	}

	@Test
	@DisplayName("get all the universitys and list should give you an array of 1 university")
	public void getAllUniversitys() {
		// checking the service method
		assertEquals(1, service.getAllUniversity().size());

		// checking the controller method
		assertEquals(1, controller.getUniversity().size());
	}

	@Test
	@DisplayName("save the valid university and acknowledge the same")
	public void saveUniversityToTheServer() {
		University university = new University(9000,"chet","12345","Chetan","Sapient","chetan@gmail.com","9911567356","Good","Java Full Stack",68);
		
		//checking the service method
		University universityDummy = service.saveUniversity(university);
		assertNotNull(universityDummy);
		
		 
	}
	
	@Test
	@DisplayName("Update the valid university and acknowledge the same")
	public void updateUniversityToTheServer() {
		University university = new University(9000,"chet","12345","Chetan","Sapient","chetan@gmail.com","9911567356","Good","Java Full Stack",68);
		
		//checking the service method
		University universityDummy = service.updateUniversity(university);
		assertNotNull(universityDummy);
		
		 
	}
	

}