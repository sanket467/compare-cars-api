package com.carcom.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.carcom.api.model.CarBrand;

@Repository
public interface CarBrandRepository extends MongoRepository<CarBrand, String> {
	CarBrand findBySid(String sid);
}
