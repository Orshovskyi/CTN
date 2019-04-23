package com.example.CTN.model;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table
@EqualsAndHashCode(of = {"id"})
public class Debt {
    @Id
    @GeneratedValue
    private Long id;
    private Double amountOfDebt;
    private String durationOfDebt;

    public Debt() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmountOfDebt() {
        return amountOfDebt;
    }

    public void setAmountOfDebt(Double amountOfDebt) {
        this.amountOfDebt = amountOfDebt;
    }

    public String getDurationOfDebt() {
        return durationOfDebt;
    }

    public void setDurationOfDebt(String durationOfDebt) {
        this.durationOfDebt = durationOfDebt;
    }
}
