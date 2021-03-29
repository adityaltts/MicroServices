package com.ltts.Car.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ltts.Car.model.Car;
import com.ltts.Car.repository.CarRepository;


@Service
public class CarService {
	@Autowired
	CarRepository carRepository;
	public List<Car> getAllCar()   
	{  
	List<Car> car = new ArrayList<Car>();  
	carRepository.findAll().forEach(car1 -> car.add(car1));  
	return car;  
	}
	public Car getCarById(int id)   
	{  
	return carRepository.findById(id).get();  
	}  
	public void saveOrUpdate(Car car)   
	{  
	carRepository.save(car);  
	} 
	public void delete(int id)   
	{  
	carRepository.deleteById(id);  
	} 
	public void update(Car car, int carid)   
	{  
	carRepository.save(car);  
	} 
}
