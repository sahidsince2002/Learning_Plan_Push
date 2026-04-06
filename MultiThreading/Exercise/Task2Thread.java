package MultiThreading.Exercise;

public class Task2Thread extends Thread {
    public void run(){
        for(int i=0;i<100;i++){
            System.out.print("# "+i);
        }
    }
}
