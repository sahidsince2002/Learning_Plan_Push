class CreditService {
    public void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

class UPIPaymentService {
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}

class OrderService  {

 private CreditService credService = new CreditService();
 private UPIPaymentService upiService = new UPIPaymentService();


    public void placeOrder(String service) {
        
        if(service.equals("Credit"))  credService.pay();
        else if(service.equals("upi")) upiService.pay();
        
        System.out.println("Order placed");
    }
}

public class TightCouplingPayment {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        orderService.placeOrder("upi");
    }
}