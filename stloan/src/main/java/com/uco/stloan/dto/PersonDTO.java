package com.uco.stloan.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class PersonDTO {

    @NotNull
    @NotBlank
    private String identification;

    @NotNull
    @NotBlank
    @Size(max = 50)
    private String name;

    @NotNull
    @NotBlank
    @Size(max = 50)
    private String lastname;

    @NotNull
    @NotBlank
    private String email;

    @NotNull
    @NotBlank
    private String password;

    @NotNull
    @NotBlank
    @Size(max = 10)
    private String mobile;

    @NotNull
    @NotBlank
    private String address;

    @NotNull
    @NotBlank
    private String rol;

    @NotNull
    @NotBlank
    private String RFID;

}
