package com.dev.magacho.stockdrinks.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class Non_AlcoholicNotFoundException extends Exception{

    public Non_AlcoholicNotFoundException(String non_AlcoholicName) {
        super(String.format("Non Alcoholic with name %s not found in the system.", non_AlcoholicName));
    }

    public Non_AlcoholicNotFoundException(Long id){
        super(String.format("Non Alcoholic  with id %s not found in the system.", id));
    }
}
