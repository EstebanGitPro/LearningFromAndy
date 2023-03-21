package com.uco.stloan.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="PERSONS")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "identification")
    private String identification;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "address")
    private String address;
    @Column(name = "rol")
    private String rol;
    @Column(name = "RFID")
    private String RFID;

    public Person( ) {
    }

    public Person( String identification, String name, String lastname, String email, String password, String mobile, String address, String rol, String RFID ) {
        this.identification = identification;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.address = address;
        this.rol = rol;
        this.RFID = RFID;
    }
}
