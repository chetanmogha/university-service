package com.company.university.controller;

import org.springframework.web.bind.annotation.RestController;

import com.company.university.beans.University;
import com.company.university.service.UniversityService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * 
 * @author Chetan
 * @version 2.0
 * @see University-Service Endpoints
 *
 */
@RestController
public class UniversityController {

	@Autowired
	private UniversityService service;
	
	
	@GetMapping("/")
	public String sayHello() {
		return "University Service Is Up";
	}
	
	
	@GetMapping("/university")
	public List<University>getUniversity(){
		
		return service.getAllUniversity();
	}
	
	@PostMapping("/university")
	public ResponseEntity<?> saveUniversity(@RequestBody University university){
		University universityList = service.saveUniversity(university);
		return ResponseEntity.status(HttpStatus.CREATED).body(universityList);
	
	}
	
	@PutMapping("/university/{id}")
	public ResponseEntity<University> updateUniversity(@RequestBody University university) {
		University updateUniversity = service.updateUniversity(university);

	return ResponseEntity.status(HttpStatus.CREATED).body(updateUniversity);
	
	}
	
	@DeleteMapping("/university/{universityId}")
	public ResponseEntity<?> deleteProject(@PathVariable Integer universityId) {
			service.deleteUniversity(universityId); 
			return ResponseEntity.status(HttpStatus.OK).body("University Deleted " + universityId);
		} 
	
	
	
}
