package com.dev.magacho.stockdrinks.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    @Id
    private Long id;

    @NotNull
    @Size(min = 1, max = 200)
    private String name;


    private String barCode;

    @NotNull
    private Float purchasePrice;

    @NotNull
    private Float salePrice;

    @NotNull
    @Max(100)
    private int quantity;

    @NotNull
    @Size(min = 1, max = 200)
    private String brand;
}
