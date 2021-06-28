package com.example.Controller;

import com.example.Model.Guest;
import com.example.Repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/guests")
public class GuestController {

    @Autowired
    GuestRepository repo;

    @GetMapping(value = "/guest/{name}")
    public String getGuest (@PathVariable String name) {
       Guest guest = repo.findByName(name);
       repo.save(guest);
       return guest.getName();
    }

}
