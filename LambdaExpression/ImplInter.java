public class ImplInter {
    public static void main(String[] args) {
        InterFace inter = new InterFace() {      // anonymous class 
            public void run(){
                System.out.println("This is running ..");
            }
        };

        InterFace inter2 = new InterFace() {      // anonymous class 
            public void run(){
                System.out.println("This is also running ..");
            }
        };

        InterFace inter3 = () -> {
                
                System.out.println("This is running from Lambda Expression ..");
            
        };
        inter.run();
        inter2.run();
        inter3.run();

    }
}
