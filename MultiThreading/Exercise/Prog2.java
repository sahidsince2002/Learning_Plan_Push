package MultiThreading.Exercise;

public class Prog2 extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from thread 2");
        }
    }
}
