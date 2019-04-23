package com.example.CTN.model;

import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table
@EqualsAndHashCode(of = {"id"})
public class CityATN {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Boolean accessToIntercity;

    public CityATN() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAccessToIntercity() {
        return accessToIntercity;
    }

    public void setAccessToIntercity(Boolean accessToIntercity) {
        this.accessToIntercity = accessToIntercity;
    }
}
