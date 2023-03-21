package com.uco.stloan.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ResourceBadRequest extends RuntimeException {

    private BindingResult bindingResult;

    public ResourceBadRequest ( String message, BindingResult bindingResult){
        super(message);
        this.bindingResult = bindingResult;
    }

    public BindingResult getBindingResult ( ) {
        return bindingResult;
    }

    public void setBindingResult ( BindingResult bindingResult ) {
        this.bindingResult = bindingResult;
    }
}