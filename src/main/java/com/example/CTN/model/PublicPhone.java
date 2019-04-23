package com.example.CTN.model;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table
@EqualsAndHashCode(of = {"id"})
public class PublicPhone {
    @Id
    @GeneratedValue
    private Long id;
    private Long address_id;
    private Long CTN_id;

    public PublicPhone() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Long address_id) {
        this.address_id = address_id;
    }

    public Long getCTN_id() {
        return CTN_id;
    }

    public void setCTN_id(Long CTN_id) {
        this.CTN_id = CTN_id;
    }
}
