package com.dev.magacho.stockdrinks.entity;

import com.dev.magacho.stockdrinks.enums.BeerType;
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
public class Beer extends Alcoholic{

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BeerType beerType;
}
