import java.util.Scanner;

interface Payments {
    public void pay();
}

class UpiService implements Payments{

    public void pay(){
        System.out.println("Payment using Upi");
    }
}

class CreditService implements Payments {

    public void pay(){
        System.out.println("Payment using Credit ");
    }
}

class NetBanking implements Payments {

    public void pay(){
        System.out.println("Payment using Net Banking");
    }
}

class OrderService {

    private Payments py; 

    public OrderService(Payments py){
       this.py = py;
    }

    public void order(){
        py.pay();
        System.out.println("Order Placed");
    }
}


public class LooseCouplingPayment {
    public static void main(String[] args) {
        // Payments py = new Payments() {
            
        // };

        String type;
        Payments py = null;

        Scanner sc = new Scanner(System.in);
        type=sc.nextLine();


        // REASON WHY WE NEEDED DEPENDENCY INJECTION IN SPRING BOOT

        if(type.equals("credit")){
            py  = new CreditService();
              
        }

        else if(type.equals("upi")){
            py = new UpiService();
           
        }

        OrderService os = new OrderService(py);
        os.order();

       
       
    }
}
