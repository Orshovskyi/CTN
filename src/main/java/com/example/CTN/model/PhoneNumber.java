package com.example.CTN.model;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table
@EqualsAndHashCode(of = {"id"})
public class PhoneNumber {
    @Id
    @GeneratedValue
    private Long id;
    private String phoneNumber;
    private int phoneNumberType_id;
    private Long address_id;

    public PhoneNumber() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumberType_id() {
        return phoneNumberType_id;
    }

    public void setPhoneNumberType_id(int phoneNumberType_id) {
        this.phoneNumberType_id = phoneNumberType_id;
    }

    public Long getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Long address_id) {
        this.address_id = address_id;
    }
}
