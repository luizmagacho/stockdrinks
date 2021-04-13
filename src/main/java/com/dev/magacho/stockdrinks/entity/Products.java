package com.dev.magacho.stockdrinks.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public abstract class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column
    private String barCode;

    @Column(nullable = false)
    private Float purchasePrice;

    @Column(nullable = false)
    private Float salePrice;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private String brand;


}
