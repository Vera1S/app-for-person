package com.vera1s.appforperson;

import jakarta.persistence.*;

import lombok.Data;


@Data
@Entity
@Table(name = "person")
public class Person {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String Surname;

    @Column(name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "Status")
    private Status status;
}
