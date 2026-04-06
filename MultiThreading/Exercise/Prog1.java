package MultiThreading.Exercise;

public class Prog1 extends Thread {

    int count;
    int num;
    Prog1(int count){
        this.count = count;
    }
    
    public void run(){
        System.out.println(getState());
        for (int i = 0; i < 10; i++) {
            System.out.println(num+++" Hello from thread "+count);
        }
        
    }
}
