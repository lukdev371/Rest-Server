package com.example.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity @Getter
@Setter
public class Booking extends IdentifiedEntity {


    @ManyToOne
    @JoinColumn(name = "apartment_id")
    private Apartment apartment;

    @ManyToOne
    @JoinColumn(name = "guest_id")
    private Guest guest;

    private int price;

    public String toString() {
        return apartment.toString() + guest + price;
    }

}