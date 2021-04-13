package com.dev.magacho.stockdrinks.dto;

import com.dev.magacho.stockdrinks.enums.DrinkType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.persistence.Enumerated;
import javax.validation.constraints.Size;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class DrinksDTO extends ProductDTO {

    @Enumerated(EnumType.STRING)
    @NotNull
    private DrinkType drinkType;

    @NotNull
    private Long mililiters;

    public DrinksDTO(Long id, @NotNull @Size(min = 1, max = 200) String name, String barCode, @NotNull Float purchasePrice, @NotNull Float salePrice, @NotNull @Max(100) int quantity, @NotNull @Size(min = 1, max = 200) String brand, DrinkType drinkType, Long mililiters) {
        super(id, name, barCode, purchasePrice, salePrice, quantity, brand);
        this.drinkType = drinkType;
        this.mililiters = mililiters;
    }
}
