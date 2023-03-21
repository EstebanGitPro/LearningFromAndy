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
public class Response {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;
    private HttpStatus status;
    private Object data;

    public static ResponseEntity<Response> createResponse(HttpStatus status, Object data) {
        Response response = new Response(LocalDateTime.now(),
                status,
                data);

        return new ResponseEntity<Response>(response, status);
    }
}
