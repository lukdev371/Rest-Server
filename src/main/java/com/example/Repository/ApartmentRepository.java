package com.example.Repository;

import com.example.Model.Apartment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ApartmentRepository extends CrudRepository<Apartment, Integer> {
    Apartment findByName(@Param(value = "name") String name);
}
