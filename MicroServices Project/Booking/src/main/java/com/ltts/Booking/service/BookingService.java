package com.ltts.Booking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.Booking.model.Booking;
import com.ltts.Booking.repository.BookingRepository;

@Service  
public class BookingService {
	@Autowired  
	BookingRepository bookingRepository;  
	public List<Booking> getAllBooking()   
	{  
	List<Booking> booking = new ArrayList<Booking>();  
	bookingRepository.findAll().forEach(booking1 -> booking.add(booking1));  
	return booking;  
	}
	public Booking getBookingById(int id)   
	{  
	return bookingRepository.findById(id).get();  
	}  
	public void saveOrUpdate(Booking booking)   
	{  
	bookingRepository.save(booking);  
	}  
	public void delete(int id)   
	{  
	bookingRepository.deleteById(id);  
	} 
	public void update(Booking booking, int bookingid)   
	{  
	bookingRepository.save(booking);  
	} 
}
