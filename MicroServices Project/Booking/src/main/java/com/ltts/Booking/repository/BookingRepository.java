package com.ltts.Booking.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltts.Booking.model.Booking;

public interface BookingRepository extends CrudRepository<Booking, Integer>  
{  
}