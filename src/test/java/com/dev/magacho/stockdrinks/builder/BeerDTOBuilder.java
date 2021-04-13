package com.dev.magacho.stockdrinks.builder;

import com.dev.magacho.stockdrinks.enums.AlcoholicType;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import com.dev.magacho.stockdrinks.dto.BeerDTO;
import com.dev.magacho.stockdrinks.enums.BeerType;
import com.dev.magacho.stockdrinks.enums.DrinkType;
import lombok.Builder;

@Builder
public class BeerDTOBuilder {

    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String name = "Brahma";

    @Builder.Default
    private String brand = "Ambev";

    @Builder.Default
    private String barCode = "21321312312";

    @Builder.Default
    private DrinkType drinkType = DrinkType.ALCOHOLIC;

    @Builder.Default
    private BeerType beerType = BeerType.PILSEN;

    @Builder.Default
    private AlcoholicType alcoholicType = AlcoholicType.BEER;

    @Builder.Default
    private long mililiters = 600L;

    @Builder.Default
    private Float purchasePrice = 4.50F;

    @Builder.Default
    private Float salePrice = 6.50F;

    @Builder.Default
    private Float percentAlcohol = 4.5F;

    @Builder.Default
    private int quantity = 50;

    public BeerDTO toBeerDTO() {
        return new BeerDTO(id,
                name,
                barCode,
                purchasePrice,
                salePrice,
                quantity,
                brand,
                drinkType,
                mililiters,
                alcoholicType,
                percentAlcohol,
                beerType);
    }
}
