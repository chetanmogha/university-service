package com.company.university.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.university.beans.University;
import com.company.university.repo.UniversityRepository;

/**
 * 
 * @author Chetan
 * @version 2.0
 * @see University Service methods
 *
 */
@Service
public class UniversityService {
	@Autowired
	private UniversityRepository universityRepo;

	public University saveUniversity(University university) {
		universityRepo.insert(university);
		return university;
	}

	public University updateUniversity(University university) {
		 universityRepo.save(university);
		 return university;
	}

	public Optional<University> getUserById(Integer id) {
		return universityRepo.findById(id);
	}

	public List<University> getAllUniversity() {
		return universityRepo.findAll();
	}

	public void deleteUniversity(Integer Id) {
		universityRepo.deleteById(Id);
	}

}
