package com.example.CTN.model;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table
@EqualsAndHashCode(of = {"id"})
public class Queue {
    @Id
    @GeneratedValue
    private Long id;
    private int queueType_id;
    private int technicalOpportunity_id;

    public Queue() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQueueType_id() {
        return queueType_id;
    }

    public void setQueueType_id(int queueType_id) {
        this.queueType_id = queueType_id;
    }

    public int getTechnicalOpportunity_id() {
        return technicalOpportunity_id;
    }

    public void setTechnicalOpportunity_id(int technicalOpportunity_id) {
        this.technicalOpportunity_id = technicalOpportunity_id;
    }
}
