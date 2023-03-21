package com.uco.stloan.web;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class ErrorResponse {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;
    private HttpStatus status;
    private String message;
    private Object errors;

    public static ResponseEntity<ErrorResponse> createErrorResponse( HttpStatus status, String message,Object errors) {
        ErrorResponse response = new ErrorResponse(LocalDateTime.now(),
                status,
                message,
                errors);

        return new ResponseEntity<ErrorResponse>(response, status);
    }
}
