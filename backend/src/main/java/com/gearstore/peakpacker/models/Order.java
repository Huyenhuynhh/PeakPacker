// user orders
package com.gearstore.peakpacker.models;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "orders")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date datePlaced; // date the order was placed

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // the user who place the order

    @Column(nullable = false)
    private Double totalAmount;

    @Column(nullable = false)
    private String status;

    @Embedded
    private Address shippingAddress;

    @OneToMany(mappedBy = "order") // one order can have many order items
    private List<OrderItem> orderItems;

}
