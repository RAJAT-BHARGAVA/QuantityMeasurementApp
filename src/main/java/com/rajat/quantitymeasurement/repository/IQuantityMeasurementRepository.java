package com.rajat.quantitymeasurement.repository;

import com.rajat.quantitymeasurement.entity.QuantityMeasurementEntity;

public interface IQuantityMeasurementRepository {
	
	void save(QuantityMeasurementEntity entity);
	
}