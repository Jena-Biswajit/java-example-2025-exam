package com.example.strategydesignpattern.provider;

import com.example.strategydesignpattern.contracts.PaymentStrategy;
import com.example.strategydesignpattern.models.CreditCardPayment;
import com.example.strategydesignpattern.models.DebitCardPayment;

public class PaymentProvider {

    // to check the type of card
   private String cardType ;

    public PaymentProvider(String cardType){
        this.cardType = cardType ;
    }

    public PaymentStrategy getPaymentStrategy(){
        // switch-case to evaluate type of card

        switch (cardType){
            case "debitcard":
                return new CreditCardPayment();
            case "creditcard":
                return new DebitCardPayment();
            default:
                throw new IllegalArgumentException("unsupported card type");
        }
    }
}
