package com.rajat.quantitymeasurement.controller;

import com.rajat.quantitymeasurement.dto.QuantityDTO;
import com.rajat.quantitymeasurement.repository.QuantityMeasurementCacheRepository;
import com.rajat.quantitymeasurement.service.IQuantityMeasurementService;
import com.rajat.quantitymeasurement.service.QuantityMeasurementServiceImpl;

public class QuantityMeasurementController {

    private final IQuantityMeasurementService service;

    public QuantityMeasurementController() {
        this.service = new QuantityMeasurementServiceImpl(new QuantityMeasurementCacheRepository());
    }

    public QuantityMeasurementController(IQuantityMeasurementService service) {
        this.service = service;
    }

    public QuantityDTO add(QuantityDTO q1, QuantityDTO q2) {
        return service.add(q1, q2);
    }

    public QuantityDTO subtract(QuantityDTO q1, QuantityDTO q2) {
        return service.subtract(q1, q2);
    }

    public QuantityDTO convert(QuantityDTO q1, QuantityDTO q2) {
        return service.convert(q1, q2);
    }

    public boolean compare(QuantityDTO q1, QuantityDTO q2) {
        return service.compare(q1, q2);
    }

    public double divide(QuantityDTO q1, QuantityDTO q2) {
        return service.divide(q1, q2);
    }
}