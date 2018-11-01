package com.apap.tutorial7.service;

import java.util.List;
import java.util.Optional;

import com.apap.tutorial7.model.FlightModel;

/**
 * FlightService
 */
public interface FlightService {
    FlightModel addFlight(FlightModel flight);
    
    void deleteByFlightNumber(String flightNumber);
    
    List<FlightModel> getAllFlight();

    FlightModel getFlightDetailById(long id);
    
    void deleteFlight(FlightModel flight);
    
    Optional<FlightModel> getFlightDetailByFlightNumber(String flightNumber);
}