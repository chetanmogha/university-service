package com.company.university.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.company.university.beans.*;

@Repository
public interface UniversityRepository extends MongoRepository<University,Integer> {


	

}
