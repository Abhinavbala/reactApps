package com.rest.profit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rest.profit.model.ProfitModel;

public interface ProfitRepository extends MongoRepository<ProfitModel, String>{
	//boolean exitByName(String name);
}
