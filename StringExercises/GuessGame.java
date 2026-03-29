import java.util.Scanner;

class Game {
    int min; 
    int max;
    int range;
    
    Game(int min,int max){
        this.min=min;
        this.max=max;
        range = max - min +1;              // to exclude [0-100] and include [1-100]
    }
    public int guess(){
        int num = (int) (Math.random() * range);
        return num;
    }
}


public class GuessGame {
    public static void main(String[] args) {
        Game gm = new Game(1,100);
        Scanner sc = new Scanner(System.in);
        int guess = gm.guess();
        int chances = 10;
        while(chances > 0){
        System.out.println("Guess a number: ");
        int guessed = sc.nextInt();
        if(guess==guessed){
            System.out.println("Congratulations you've Gussed the number correct");
            return;
        }
        else if(guess<guessed){
            System.out.println("Your Gussed number is high");
        }
        
        else {
            System.out.println("Your Guessed number is low ");
        }
        chances--;
    }
    System.out.println("Your chances got exhausted");
}
}
