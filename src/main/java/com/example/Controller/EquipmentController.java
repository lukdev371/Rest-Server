package com.example.Controller;

import com.example.Model.Equipment;
import com.example.Repository.ApartmentRepository;
import com.example.Repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/equipments")
public class EquipmentController {

    @Autowired
    EquipmentRepository repo;

    @GetMapping
    public List<String> getEquipment() {
        Stream<Equipment> equipment = StreamSupport.stream(repo.findAll().spliterator(), false);
        return equipment.map(Equipment::toString).sorted().collect(Collectors.toList());
    }
}
