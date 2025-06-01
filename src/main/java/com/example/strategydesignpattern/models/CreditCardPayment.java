package com.example.strategydesignpattern.models;

import com.example.strategydesignpattern.contracts.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(int amount){
        System.out.println("paid vaia credit card");
    }
}
