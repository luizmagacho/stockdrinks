package com.dev.magacho.stockdrinks.dto;


import com.dev.magacho.stockdrinks.enums.AlcoholicType;
import com.dev.magacho.stockdrinks.enums.DrinkType;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlcoholicDTO extends DrinksDTO {

    @Enumerated(EnumType.STRING)
    @NotNull
    private AlcoholicType alcoholicType;

    @NotNull
    private Float percentAlcohol;

    public AlcoholicDTO(Long id, String name, String barCode, Float purchasePrice, Float salePrice, int quantity, String brand, DrinkType drinkType, Long mililiters, AlcoholicType alcoholicType, Float percentAlcohol) {
        super(id, name, barCode, purchasePrice, salePrice, quantity, brand, drinkType, mililiters);
        this.alcoholicType = alcoholicType;
        this.percentAlcohol = percentAlcohol;
    }
}
