package com.uco.stloan.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundEx extends RuntimeException {

  public NotFoundEx(String message) {
    super(message);
  }
}
