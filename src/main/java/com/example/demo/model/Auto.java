package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "auto")
@Getter
@Setter
public class Auto implements Serializable {

    @Id
    private long id;

    @Column
    private String model;

    @Column
    private String regNumber;

    @ManyToOne
    private People owner;

    public Auto() {
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", regNumber='" + regNumber + '\'' +
                '}';
    }
}
