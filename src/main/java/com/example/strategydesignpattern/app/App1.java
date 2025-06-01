package com.example.strategydesignpattern.app;

import com.example.strategydesignpattern.contracts.PaymentStrategy;
import com.example.strategydesignpattern.provider.PaymentProvider;

public class App1 {
    public static void main(String[] args) {
        PaymentProvider paymentProvider = new PaymentProvider("");

        PaymentStrategy paymentStrategy = paymentProvider.getPaymentStrategy();
        paymentStrategy.pay(1000);
    }
}
