package com.example.HIbernatePart2.Entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ch")
public class Cheque extends Payment{

    private Integer chequeno;

    public Cheque(Integer amount, Integer chequeno) {
        super(amount);
        this.chequeno = chequeno;
    }

    public Integer getChequeno() {
        return chequeno;
    }

    public void setChequeno(Integer chequeno) {
        this.chequeno = chequeno;
    }
}
