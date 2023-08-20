//user information
package com.gearstore.peakpacker.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users") // specifies name of the table that mapped to User
@Getter
@Setter
public class User {
    @Id // designated id is primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // tells JPA that id should be generated automatically
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @OneToMany(mappedBy = "users") // one user can place many orders
    private List<Order> orders;

}