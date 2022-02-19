package com.carcom.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.carcom.api.jsonmodel.Car;
import com.carcom.api.model.CarBrand;
import com.carcom.api.model.CarEnt;
import com.carcom.api.repository.CarBrandRepository;
import com.carcom.api.repository.CarRepository;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarBrandRepository carBrandRepository;
	
	@Autowired
	private CarRepository carRepository;
	
	@Override
	public ResponseEntity<?> addCar(Car car) {
		CarBrand brand = new CarBrand();
		brand = carBrandRepository.findBySid(car.getBrandSid());
		System.out.println(brand.toString());
		CarEnt carEnt = new CarEnt();
		carEnt.setBrandSid(brand.getSid());
		carEnt.setCarName(car.getCarName());
		carEnt.setVariant(car.getVariant());
		return new ResponseEntity<>(carRepository.save(carEnt), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> getCarsBySid(String sid) {
		return new ResponseEntity<>(carRepository.findAllByBrandSid(sid), HttpStatus.OK);
	}

}
