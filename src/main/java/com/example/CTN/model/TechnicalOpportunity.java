package com.example.CTN.model;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table
@EqualsAndHashCode(of = {"id"})
public class TechnicalOpportunity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public TechnicalOpportunity() {
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
}
