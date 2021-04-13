package com.dev.magacho.stockdrinks.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class Non_AlcoholicAlreadyRegisteredException extends Exception {

    public Non_AlcoholicAlreadyRegisteredException(String non_AlcoholicName) {
        super(String.format("Beer with name %s already registered in the system.", non_AlcoholicName));
    }
}
