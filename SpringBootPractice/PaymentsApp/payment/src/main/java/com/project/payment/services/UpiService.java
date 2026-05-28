package com.project.payment.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class UpiService implements PaymentsInterface {
    public void pay(){
        System.out.println("Payment through upi");
    }
}
