package com.vera1s.appforperson;

import ch.qos.logback.core.status.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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

    @Column(name = "Status")
    private String Status;
}
