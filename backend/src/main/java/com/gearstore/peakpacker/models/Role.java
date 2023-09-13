package com.gearstore.peakpacker.models;

import jakarta.persistence.*;
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(length = 20, unique = true, nullable = false)
    private  ERole name;

    public Role(){

    }

    public Role(ERole name){
        this.name = name;
    }

    public Long getId(){ return id ; }

    public void setId(Long id) { this.id = id; }

    public ERole getName(){
        return this.name;
    }

    public void setName(ERole name){
        this.name = name;
    }
}
