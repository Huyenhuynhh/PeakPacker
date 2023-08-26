// a specific product within an order to account the fact that an order may have multiple items
package com.gearstore.peakpacker.models;

import javax.persistence.*;

@Entity
@Table(name = "orderItems")

public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    private Product product;

    private String productName;
    private Integer quantity;
    private Double priceAtTheTimeOrdered;
}
