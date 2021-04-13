package com.dev.magacho.stockdrinks.entity;

import com.dev.magacho.stockdrinks.enums.AlcoholicType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Alcoholic extends Drinks{

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AlcoholicType alcoholicType;

    @NotNull
    private Float percentAlcohol;




}
