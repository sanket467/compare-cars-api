package com.carcom.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.carcom.api.jsonmodel.Brand;
import com.carcom.api.model.CarBrand;
import com.carcom.api.repository.CarBrandRepository;

@Service
public class CarBrandServiceImpl implements CarBrandService {
	@Autowired
	private CarBrandRepository carBrandRepository;
	
	@Override
	public List<CarBrand> getAllBrands(){
		return carBrandRepository.findAll();
	}

	@Override
	public ResponseEntity<?> addBrand(Brand brand) {
		CarBrand carBrand = new CarBrand();
		carBrand.setSid(brand.getSid());
		carBrand.setManufacturer(brand.getManufacturer());
		return new ResponseEntity<>(carBrandRepository.save(carBrand), HttpStatus.OK);
	}

}
