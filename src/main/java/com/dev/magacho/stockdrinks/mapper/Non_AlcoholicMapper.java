package com.dev.magacho.stockdrinks.mapper;

import com.dev.magacho.stockdrinks.dto.Non_AlcoholicDTO;
import com.dev.magacho.stockdrinks.entity.Non_Alcoholic;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface Non_AlcoholicMapper {

    Non_AlcoholicMapper INSTANCE = Mappers.getMapper(Non_AlcoholicMapper.class);

    Non_Alcoholic toModel(Non_AlcoholicDTO non_alcoholicDTO);

    Non_AlcoholicDTO toDTO(Non_Alcoholic non_alcoholic);
}
