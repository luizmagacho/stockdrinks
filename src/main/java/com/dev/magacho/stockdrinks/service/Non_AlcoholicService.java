package com.dev.magacho.stockdrinks.service;


import com.dev.magacho.stockdrinks.dto.Non_AlcoholicDTO;
import com.dev.magacho.stockdrinks.entity.Non_Alcoholic;
import com.dev.magacho.stockdrinks.exception.Non_AlcoholicAlreadyRegisteredException;
import com.dev.magacho.stockdrinks.exception.Non_AlcoholicNotFoundException;
import com.dev.magacho.stockdrinks.mapper.Non_AlcoholicMapper;
import com.dev.magacho.stockdrinks.repository.Non_AlcoholicRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class Non_AlcoholicService {

    private final Non_AlcoholicRepository non_AlcoholicRepository;

    private final Non_AlcoholicMapper non_alcoholicMapper = Non_AlcoholicMapper.INSTANCE;

    public Non_AlcoholicDTO CreateNon_Alcoholic(Non_AlcoholicDTO non_alcoholicDTO) throws Non_AlcoholicAlreadyRegisteredException {
        verifyIfIsAlreadyRegistred(non_alcoholicDTO.getName());
        Non_Alcoholic non_alcoholic = non_alcoholicMapper.toModel(non_alcoholicDTO);
        Non_Alcoholic savedNon_Alcoholic = non_AlcoholicRepository.save(non_alcoholic);

        return non_alcoholicMapper.toDTO(savedNon_Alcoholic);

    }

    public Non_AlcoholicDTO findByName(String name) throws Non_AlcoholicNotFoundException {
        Non_Alcoholic foundNon_Alcoholic = non_AlcoholicRepository.findByName(name)
                .orElseThrow(() -> new Non_AlcoholicNotFoundException(name));
        return non_alcoholicMapper.toDTO(foundNon_Alcoholic);
    }

    public List<Non_AlcoholicDTO> listAll() {
        return non_AlcoholicRepository.findAll()
                .stream()
                .map(non_alcoholicMapper::toDTO)
                .collect(Collectors.toList());
    }

    public void deleteById(Long id) throws Non_AlcoholicNotFoundException {
        verifyIfExists(id);
        non_AlcoholicRepository.deleteById(id);
    }

    private void verifyIfIsAlreadyRegistred(String name) throws Non_AlcoholicAlreadyRegisteredException {
        Optional<Non_Alcoholic> optSavedNon_Alcoholic = non_AlcoholicRepository.findByName(name);
        if(optSavedNon_Alcoholic.isPresent()){
            throw new Non_AlcoholicAlreadyRegisteredException(name);
        }
    }

    private Non_Alcoholic verifyIfExists(Long id) throws Non_AlcoholicNotFoundException {
        return non_AlcoholicRepository.findById(id)
                .orElseThrow(() -> new Non_AlcoholicNotFoundException(id));
    }
}
