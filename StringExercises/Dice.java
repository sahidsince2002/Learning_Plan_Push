// Simulate a dice role using math.random 1-6 

import java.lang.Math;
import java.util.Scanner;
public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 6;
        int min =1;
        int range = max - min +1;
        while(true){
            System.out.println("Press 1 to roll the dice ");
            int n = sc.nextInt();

            switch(n){
                case 1:    int rand = (int) (Math.random() * range) + 1;
                           System.out.println("Dice rolled and got : "+ rand);
                           break;
            }
        }
    }
}