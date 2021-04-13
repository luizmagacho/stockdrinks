package com.dev.magacho.stockdrinks.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Non_AlcoholicType {

    SODA("soda"),
    JUICE("juice"),
    ENERGY_DRINK("energy drink"),
    ISOTONIC("isotonic");

    private final String description;
}
