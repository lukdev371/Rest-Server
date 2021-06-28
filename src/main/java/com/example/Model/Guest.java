package com.example.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity @Getter @Setter
public class Guest extends IdentifiedEntity {

    private String name;

    @OneToMany
    private List<Booking> bookingListGuest;

    public String toString() {
        return name;
    }
}
