package com.project.payment.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentsInterface pi;

    public OrderService(@Qualifier("cardservice") PaymentsInterface pi){
        this.pi=pi;
    }

    public void order(){
        pi.pay();
        System.out.println("Order Placed");
    }
}
