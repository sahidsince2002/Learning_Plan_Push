package MultiThreading.Exercise;
public class TaskMain {
    public static void main(String[] args) {
        Task1Thread t1 = new Task1Thread();
        Task2Thread t2 = new Task2Thread();
        
        t1.start();
        t2.start();
    }
}
