package com.carcom.api.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;

import com.carcom.api.controller.CarCompare;
import com.carcom.api.jsonmodel.Brand;
import com.carcom.api.jsonmodel.Car;
import com.carcom.api.service.CarBrandService;
import com.carcom.api.service.CarService;

@Controller
public class CarCompareImpl implements CarCompare {
	
	@Autowired
	private CarBrandService carBrandService;
	
	@Autowired
	private CarService carService;
	
	@Override
	public ResponseEntity<?> getAllManufacturers() {
		return new ResponseEntity<>(carBrandService.getAllBrands(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> addManufacturer(@RequestBody Brand carBrand) {
		if (!StringUtils.isEmpty(carBrand.getManufacturer()) && !StringUtils.isEmpty(carBrand.getSid())) {     
			return carBrandService.addBrand(carBrand);
		}
		return new ResponseEntity<>("Missing Mandatory fields", HttpStatus.BAD_REQUEST);
	}

	@Override
	public ResponseEntity<?> addCar(Car car) {
		if(!StringUtils.isEmpty(car.getCarName()) && !StringUtils.isEmpty(car.getVariant()) && !StringUtils.isEmpty(car.getVariant())) {
			return carService.addCar(car);
		}
		return new ResponseEntity<>("Missing Mandatory fields", HttpStatus.BAD_REQUEST);
	}

	@Override
	public ResponseEntity<?> getCarsBySid(String sid) {
		if(!StringUtils.isEmpty(sid)) {
			return carService.getCarsBySid(sid);
		}
		return new ResponseEntity<>("Missing Mandatory fields", HttpStatus.BAD_REQUEST);
	}

}
