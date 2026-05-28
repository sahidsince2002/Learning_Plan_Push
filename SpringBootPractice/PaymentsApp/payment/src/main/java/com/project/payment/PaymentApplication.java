package com.project.payment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.payment.services.OrderService;


@SpringBootApplication
public class PaymentApplication implements CommandLineRunner {
    
	private final OrderService os;

	public PaymentApplication(OrderService os){
        this.os=os;
	}

	public static void main(String[] args) {
		
		SpringApplication.run(PaymentApplication.class, args);
	}

	public void run(String... args){
		os.order();
	}

}
