package com.example.CTN.model;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table
@EqualsAndHashCode(of = {"id"})
public class Consumer {
    @Id
    @GeneratedValue
    private Long id;
    private String secondName;
    private String firstName;
    private String middleName;
    private String gender;
    private int age;
    private Long phoneNumber_id;
    private Long CTN_id;
    private int consumerType_id;
    private Boolean accessToIntercity;
    private Double payment;
    private Long payment_id;
    private Long debt_id;

    public Consumer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getPhoneNumber_id() {
        return phoneNumber_id;
    }

    public void setPhoneNumber_id(Long phoneNumber_id) {
        this.phoneNumber_id = phoneNumber_id;
    }

    public Long getCTN_id() {
        return CTN_id;
    }

    public void setCTN_id(Long CTN_id) {
        this.CTN_id = CTN_id;
    }

    public int getConsumerType_id() {
        return consumerType_id;
    }

    public void setConsumerType_id(int consumerType_id) {
        this.consumerType_id = consumerType_id;
    }

    public Boolean getAccessToIntercity() {
        return accessToIntercity;
    }

    public void setAccessToIntercity(Boolean accessToIntercity) {
        this.accessToIntercity = accessToIntercity;
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public Long getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(Long payment_id) {
        this.payment_id = payment_id;
    }

    public Long getDebt_id() {
        return debt_id;
    }

    public void setDebt_id(Long debt_id) {
        this.debt_id = debt_id;
    }
}
