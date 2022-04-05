package com.company.university.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.company.university.repo.UniversityRepository;

/**
 * 
 * @author Chetan
 * @version 2.0
 * @see MongoConfig for Employee
 *
 */
@Configuration
@EnableMongoRepositories(basePackageClasses=UniversityRepository.class)
public class MongoConfig {
	
	@Bean
	public CommandLineRunner commandLineRunner(UniversityRepository employRepo) {
		
		
		return null;
		
	}

}
