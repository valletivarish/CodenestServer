package com.buyzaar.myapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.buyzaar.myapp.entity.DatabaseSequence;

public interface DatabaseSeqRepository extends MongoRepository<DatabaseSequence, String>{

}
