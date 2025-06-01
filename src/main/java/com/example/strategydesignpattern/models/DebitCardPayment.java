package com.example.strategydesignpattern.models;

import com.example.strategydesignpattern.contracts.PaymentStrategy;

public class DebitCardPayment implements PaymentStrategy {

    @Override
    public void pay(int amount){
        System.out.println("payment via debit card");
    }
}
