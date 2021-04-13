package com.dev.magacho.stockdrinks.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AlcoholicType {


    BEER("beer"),
    WINE("wine"),
    SAKE("saké"),
    GIN("gin"),
    WHISKEY("whiskey"),
    RUM("rum"),
    TEQUILA("tequila"),
    VODKA("vodka"),
    CACHACA("cachaça");

    private final String description;

}
