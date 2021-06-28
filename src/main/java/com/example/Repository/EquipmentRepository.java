package com.example.Repository;

import com.example.Model.Equipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface EquipmentRepository extends CrudRepository<Equipment, Integer> {
    Equipment findByLabel(@Param(value = "label") String label);
}
