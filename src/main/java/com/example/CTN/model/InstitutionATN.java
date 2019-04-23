package com.example.CTN.model;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table
@EqualsAndHashCode(of = {"id"})
public class InstitutionATN {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Boolean availabilityOfPublicTelephones;
    private Boolean abilityToCommunicateWithAnotherInstitution;

    public InstitutionATN() {
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

    public Boolean getAvailabilityOfPublicTelephones() {
        return availabilityOfPublicTelephones;
    }

    public void setAvailabilityOfPublicTelephones(Boolean availabilityOfPublicTelephones) {
        this.availabilityOfPublicTelephones = availabilityOfPublicTelephones;
    }

    public Boolean getAbilityToCommunicateWithAnotherInstitution() {
        return abilityToCommunicateWithAnotherInstitution;
    }

    public void setAbilityToCommunicateWithAnotherInstitution(Boolean abilityToCommunicateWithAnotherInstitution) {
        this.abilityToCommunicateWithAnotherInstitution = abilityToCommunicateWithAnotherInstitution;
    }
}
