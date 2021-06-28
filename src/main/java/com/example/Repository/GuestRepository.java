package com.example.Repository;

import com.example.Model.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface GuestRepository extends CrudRepository<Guest, Integer> {
    Guest findByName(@Param(value = "name") String name);
}

