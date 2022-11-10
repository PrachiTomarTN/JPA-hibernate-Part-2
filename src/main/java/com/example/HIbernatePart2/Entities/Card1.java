package com.example.HIbernatePart2.Entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@PrimaryKeyJoinColumn(name = "ID")
@Entity
public class Card1 extends Payment1{

    private Integer cardno;

    public Card1(Integer amount, Integer cardno) {
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
