package com.ltts.Car.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltts.Car.model.Car;



public interface CarRepository extends CrudRepository<Car, Integer>  
{  
}
