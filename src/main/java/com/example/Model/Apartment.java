package com.example.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity @Getter
@Setter
public class Apartment extends IdentifiedEntity {

    private String name;

    private String address;

    @OneToMany(mappedBy = "apartment")
    private List<Booking> bookingListApartment;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "apartment_equipment",
            joinColumns = @JoinColumn(name = "apartment_id"),
            inverseJoinColumns = @JoinColumn(name = "equipment_id")
    )
    List<Equipment> equipmentList;

    public String toString() {
        return name + ", " + address;
    }
}
