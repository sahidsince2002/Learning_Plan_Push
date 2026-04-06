

class NewThread extends Thread {
    int count;

    NewThread(int count){
       this.count = count;
    }
    public void run(){
        System.out.println(getState());
        System.out.printf("Thread %d is running\n ",count);
    }
}


public class ThreadJoin {
    public static void main(String[] args) {
        NewThread t1 = new NewThread(1);
        System.out.println(t1.getState());
        t1.start();
        
        NewThread t2 = new NewThread(2);
        System.out.println(t2.getState());
        t2.start();

        NewThread t3 = new NewThread(3);
        System.out.println(t3.getState());
        t3.start();

       
       
       
       
        
        



    }
}
