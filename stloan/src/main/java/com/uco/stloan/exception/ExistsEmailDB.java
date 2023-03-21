package com.uco.stloan.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ExistsEmailDB extends RuntimeException {

    public ExistsEmailDB(String message) {
        super(message);
    }
}
