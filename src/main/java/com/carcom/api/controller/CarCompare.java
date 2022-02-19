package com.carcom.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.carcom.api.jsonmodel.Brand;
import com.carcom.api.jsonmodel.Car;

@RequestMapping(value = "")
public interface CarCompare {
	@RequestMapping(value = "/brands", produces = { "application/json;charset=utf-8" }, consumes = {
			"application/json;charset=utf-8" }, method = RequestMethod.GET)
	@CrossOrigin
	ResponseEntity<?> getAllManufacturers();

	@RequestMapping(value = "/carsBySid", produces = { "application/json;charset=utf-8" }, consumes = {
			"application/json;charset=utf-8" }, method = RequestMethod.GET)
	@CrossOrigin
	ResponseEntity<?> getCarsBySid(@RequestParam String sid);

	@RequestMapping(value = "/brands", produces = { "application/json;charset=utf-8" }, consumes = {
			"application/json;charset=utf-8" }, method = RequestMethod.POST)
	@CrossOrigin
	ResponseEntity<?> addManufacturer(@RequestBody Brand carBrand);

	@RequestMapping(value = "/car", produces = { "application/json;charset=utf-8" }, consumes = {
			"application/json;charset=utf-8" }, method = RequestMethod.POST)
	@CrossOrigin
	ResponseEntity<?> addCar(@RequestBody Car car);
}
