class Main {

    public static void main(String[] args) {

        int num = 223;
        int original = num;

        int sum = 0;

        while(num != 0){

            int rem = num % 10;

            sum = sum + (rem * rem * rem);

            num = num / 10;
        }

        if(sum == original){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}