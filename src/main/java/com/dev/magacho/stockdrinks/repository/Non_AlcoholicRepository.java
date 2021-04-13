package com.dev.magacho.stockdrinks.repository;

import com.dev.magacho.stockdrinks.entity.Non_Alcoholic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Non_AlcoholicRepository extends JpaRepository<Non_Alcoholic, Long> {

    Optional<Non_Alcoholic> findByName(String name);
}
