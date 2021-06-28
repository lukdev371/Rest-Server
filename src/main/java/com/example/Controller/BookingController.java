package com.example.Controller;

import com.example.Model.Booking;
import com.example.Model.Equipment;
import com.example.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    BookingRepository repo;


    @GetMapping
    public List<String> getEquipment() {
        Stream<Booking> booking = StreamSupport.stream(repo.findAll().spliterator(), false);
        return booking.map(Booking::toString).sorted().collect(Collectors.toList());
    }
}
