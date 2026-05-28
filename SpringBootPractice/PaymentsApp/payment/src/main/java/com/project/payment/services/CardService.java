package com.project.payment.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("cardservice")
public class CardService implements PaymentsInterface{
   public void pay(){
    System.out.println("Payment through card service");
   }
}
