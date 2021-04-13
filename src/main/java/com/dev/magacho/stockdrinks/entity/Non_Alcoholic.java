package com.dev.magacho.stockdrinks.entity;

import com.dev.magacho.stockdrinks.enums.Non_AlcoholicType;
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
public class Non_Alcoholic extends Drinks {

    /*@Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Non_AlcoholicType non_AlcoholicType;*/

    @Column(nullable = false)
    private String brand;




}
