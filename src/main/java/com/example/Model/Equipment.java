package com.example.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Entity @Getter @Setter
public class Equipment extends IdentifiedEntity {

    public String label;

    @ManyToMany(cascade = CascadeType.ALL)
    List<Apartment> apartmentList;

    public String toString() {
        return label + apartmentList;
    }
}
