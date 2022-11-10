package com.example.HIbernatePart2.Entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cc")
public class Card extends Payment{

    private Integer cardno;

    public Card(Integer amount, Integer cardno) {
        super(amount);
        this.cardno = cardno;
    }

    public Integer getCardno() {
        return cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }
}
