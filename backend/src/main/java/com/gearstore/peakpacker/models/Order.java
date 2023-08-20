// user orders
package com.gearstore.peakpacker.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "orders")
@Getter
@Setter
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

    @OneToMany(mappedBy = "orders") // one order can have many items
    private List<OrderItem> orderItems;

}
