package com.dev.magacho.stockdrinks.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DrinkType {

    NON_ALCOHOLIC("non-alcoholic"),
    ALCOHOLIC("alcoholic");

    private final String description;

}
