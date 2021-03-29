package com.ltts.Booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ltts.Booking.model.Booking;
import com.ltts.Booking.service.BookingService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;  
@RestController
public class BookingController {
	@Autowired  
	BookingService bookingService;  

@GetMapping("/booking")  
private List<Booking> getAllBooking()   
{  
return bookingService.getAllBooking();  
}
@GetMapping("/booking/{bookingid}")  
private Booking getBooking(@PathVariable("bookingid") int bookingid)   
{  
return bookingService.getBookingById(bookingid);  
}  
@DeleteMapping("/booking/{bookingid}")  
private void deleteBooking(@PathVariable("bookingid") int bookingid)   
{  
bookingService.delete(bookingid);  
}  
@PostMapping("/booking")  
private int saveBooking(@RequestBody Booking booking)   
{  
bookingService.saveOrUpdate(booking);  
return booking.getBookingid();  
} 
@PutMapping("/booking")  
private Booking update(@RequestBody Booking booking)   
{  
bookingService.saveOrUpdate(booking);  
return booking;  
}
}