package com.carcom.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.carcom.api.jsonmodel.Brand;
import com.carcom.api.model.CarBrand;
import com.carcom.api.repository.CarBrandRepository;

@Service
public interface CarBrandService {
	public List<CarBrand> getAllBrands();
	public ResponseEntity<?> addBrand(Brand brand);
}
