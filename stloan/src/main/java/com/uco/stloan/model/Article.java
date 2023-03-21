package com.uco.stloan.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="ARTICLES")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ref")
    private String ref;
    @Column(name = "name")
    private String name;
    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "status")
    private  String status;


    public Article(String ref, String name, Integer quantity, String status ) {
        this.ref = ref;
        this.name = name;
        this.quantity = quantity;
        this.status = status;
    }

    public Article() {
    }
}
