package com.example.Repository;


import com.example.Model.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;


@Repository
public interface BookingRepository extends CrudRepository<Booking, Integer> {
   /* Booking findByBookingDate(@Param(value = "bookingDate") Date date);*/
}
