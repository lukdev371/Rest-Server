package com.example.Controller;

import com.example.Model.Apartment;
import com.example.Model.Equipment;
import com.example.Repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/apartments")
public class ApartmentController {

    @Autowired
    ApartmentRepository repo;

    @GetMapping
    public List<String> getApartment() {
        Stream<Apartment> apartments = StreamSupport.stream(repo.findAll().spliterator(), false);
        return apartments.map(Apartment::toString).sorted().collect(Collectors.toList());
    }


}
