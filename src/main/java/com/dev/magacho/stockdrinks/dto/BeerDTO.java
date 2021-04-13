package com.dev.magacho.stockdrinks.dto;


import com.dev.magacho.stockdrinks.enums.AlcoholicType;
import com.dev.magacho.stockdrinks.enums.BeerType;
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
@Builder
@AllArgsConstructor
public class BeerDTO extends AlcoholicDTO{

    @Enumerated(EnumType.STRING)
    @NotNull
    private BeerType beerType;

    public BeerDTO(Long id, String name, String barCode, Float purchasePrice, Float salePrice, int quantity, String brand, DrinkType drinkType, Long mililiters, AlcoholicType alcoholicType, Float percentAlcohol, BeerType beerType) {
        super(id, name, barCode, purchasePrice, salePrice, quantity, brand, drinkType, mililiters, alcoholicType, percentAlcohol);
        this.beerType = beerType;
    }
}
