package com.example.demo_esercizio3test;

import jakarta.persistence.*;
import org.apache.catalina.User;

@Entity
public class EntitySalary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    @OneToOne
    @JoinColumn(name = "user_id")
    private EntityUser user;

  public EntitySalary(){}

    public EntitySalary(Double amount, EntityUser user) {
        this.amount = amount;
        this.user = user;
    }

    public Long getId() {
        return id;
    }



    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public EntityUser getUser() {
        return user;
    }

    public void setUser(EntityUser user) {
        this.user = user;
    }
}