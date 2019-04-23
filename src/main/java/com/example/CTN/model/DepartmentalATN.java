package com.example.CTN.model;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table
@EqualsAndHashCode(of = {"id"})
public class DepartmentalATN {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long typeOfDepartmentalInstitution_id;

    public DepartmentalATN() {
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

    public Long getTypeOfDepartmentalInstitution_id() {
        return typeOfDepartmentalInstitution_id;
    }

    public void setTypeOfDepartmentalInstitution_id(Long typeOfDepartmentalInstitution_id) {
        this.typeOfDepartmentalInstitution_id = typeOfDepartmentalInstitution_id;
    }
}
