package com.ltts.Car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ltts.Car.model.Car;
import com.ltts.Car.service.CarService;

@RestController
public class CarController {
	@Autowired
	CarService carService;
	@GetMapping("/car")  
	private List<Car> getAllBooking()   
	{  
	return carService.getAllCar();  
	}
	@GetMapping("/car/{carid}")  
	private Car getCar(@PathVariable("carid") int carid)   
	{  
	return carService.getCarById(carid);  
	} 
	@DeleteMapping("/car/{carid}")  
	private void deleteCar(@PathVariable("carid") int carid)   
	{  
	carService.delete(carid);  
	}
	@PostMapping("/car")  
	private int saveBooking(@RequestBody Car car)   
	{  
	carService.saveOrUpdate(car);  
	return car.getCarid();  
	} 
	@PutMapping("/car")  
	private Car update(@RequestBody Car car)   
	{  
	carService.saveOrUpdate(car);  
	return car;  
	}

}
