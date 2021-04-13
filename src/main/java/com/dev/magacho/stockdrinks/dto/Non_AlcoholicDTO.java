package com.dev.magacho.stockdrinks.dto;

import com.dev.magacho.stockdrinks.enums.DrinkType;
import com.dev.magacho.stockdrinks.enums.Non_AlcoholicType;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Non_AlcoholicDTO extends DrinksDTO{

    /*@Enumerated(EnumType.STRING)
    @NotNull
    private Non_AlcoholicType non_AlcoholicTypeType;*/

    @NotNull
    private String brand;


}
