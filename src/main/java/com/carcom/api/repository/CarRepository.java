package com.carcom.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carcom.api.model.CarEnt;
import com.carcom.api.model.CarBrand;

public interface CarRepository extends MongoRepository<CarEnt, String> {
	List<CarEnt> findAllByBrandSid(String sid);
}
