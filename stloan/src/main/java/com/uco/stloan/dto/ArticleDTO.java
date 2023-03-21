package com.uco.stloan.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;


@Getter
@Setter
public class ArticleDTO {

    @NotNull
    @NotBlank
    private String ref;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @PositiveOrZero
    private Integer quantity;


    @NotNull
    @NotBlank
    private  String status;

}
