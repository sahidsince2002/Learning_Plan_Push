package MultiThreading.Exercise;

public class ProgMain {
    public static void main(String[] args) throws InterruptedException{
        Prog1 p1 = new Prog1(1);
       // Prog1 p2 = new Prog1(2);
        System.out.println(p1.getState());
        p1.start();
        Thread.sleep(4000);
        System.out.println(p1.getState());
       // p2.start();

    }
}
