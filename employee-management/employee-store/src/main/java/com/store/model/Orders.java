package com.store.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;


@Data
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @Column(name = "order_id")
    private int orderId;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "order_date")
    private LocalDate orderDate;

    @Column(name = "status")
    private short status;

    @Column(name = "comments")
    private String comments;

    @Column(name = "shipped_date")
    private LocalDate shippedDate;

    @Column(name = "shipper_id")
    private String shipperId;

}
