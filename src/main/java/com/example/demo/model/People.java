package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "people")
@Getter
@Setter
public class People implements Serializable {

    @Id
    private long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "owner")
    private Set<Auto> autos;

    public People() {
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';

    }
}

