package com.gearstore.peakpacker.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id // designated id is primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // tells JPA that id should be generated automatically
    private Long id;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;

}