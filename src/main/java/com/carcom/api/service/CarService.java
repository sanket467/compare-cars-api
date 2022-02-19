package com.carcom.api.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.carcom.api.jsonmodel.Car;

@Service
public interface CarService {
	public ResponseEntity<?> addCar(Car car);
	public ResponseEntity<?> getCarsBySid(String sid);
}
