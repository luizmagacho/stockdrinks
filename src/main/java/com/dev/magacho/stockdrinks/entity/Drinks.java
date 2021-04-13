package com.dev.magacho.stockdrinks.entity;

import com.dev.magacho.stockdrinks.enums.DrinkType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public abstract class Drinks extends Products{

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DrinkType drinkType;

    @Column(nullable = false)
    private Long mililiters;

}
