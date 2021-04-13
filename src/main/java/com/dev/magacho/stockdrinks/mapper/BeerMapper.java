package com.dev.magacho.stockdrinks.mapper;

import com.dev.magacho.stockdrinks.dto.BeerDTO;
import com.dev.magacho.stockdrinks.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
