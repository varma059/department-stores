package com.usaa.transfers.DepartmentStores.Entity;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
@Getter
@Setter
@Builder(toBuilder = true)

@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PRODUCT_ID")
    public  Long productID;
    @Column(name="PRODUCT_NAME")
    public  String productName;
    @Column(name="MANFAC_DATE")
    public Date manfacDate;
    @Column(name="EXPIRY_DATE")
    public  Date expiryDate;
//    @Column(name="CustomerID")
//    public  Long customerID;
//    @ManyToOne
//    @JoinColumn
//    public Customer customer;


}
