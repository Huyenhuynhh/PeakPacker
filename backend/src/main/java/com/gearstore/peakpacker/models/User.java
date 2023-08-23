//user information
package com.gearstore.peakpacker.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.*;

@Entity
@Table(name = "users",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "username"),
        @UniqueConstraint(columnNames = "emails")
    }) // specifies name of the table that mapped to User
@Getter
@Setter
public class User {
    @Id // designated id is primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // tells JPA that id should be generated automatically
    private Long id;

    @NotBlank
    @Size(max = 20)
    @Column(unique = true, nullable = false)
    private String username;

    @NotBlank
    @Size(max = 120)
    private String password;

    @NotBlank
    @Size(max = 50)
    @Email
    @Column(unique = true, nullable = false)
    private String email;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable( name = "user_roles",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public User(){

    }

    public User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @OneToMany(mappedBy = "users") // one user can place many orders
    private List<Order> orders;

}

// @NotBlank use at application level to validate that a property of an entity is NOT NULL
// and has length greater than zero when trimmed. If NULL or just whitespace, a violation will occur

// @Column(nullable = false) is used at database level, if insert or update a record with a null value,
// the database will throw an error.

// If using only @NotBlank, then for some reason null value bypassed the application layer and hit
// the database, if that column in db is not set to NOT NULL then the value can be saved to db

// If using only @Column(nullable = false) then value like "   " can still be accepted into db because
// it's technically NOT NULL value.