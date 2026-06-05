import java.util.Random;
import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int totalscore = 0;
        boolean playagain = true;

        System.out.println("Welcome to the Number Game! ");
        while(playagain){
            int secretnumber = random.nextInt(100) + 1;
            int attempts = 0;
            int score = 100;
            int guess;

            System.out.println("I have selected a number between 1 to 100 for you");
            System.out.println("Try to guess it");

            do { 
                System.out.println("Enter your guess: ");
                guess = sc.nextInt();

                attempts++;

                if(guess > secretnumber){
                    System.out.println("Too high");
                    score -= 10;
                }
                else if(guess < secretnumber){
                    System.out.println("Too low");
                    score -= 10;
                }
                else{
                    System.out.println("Congratulations! You guessed the number.");
                }

                if(score < 0){
                    score = 0;
                }
            } while (guess != secretnumber);

            System.out.println("Round result: ");
            System.out.println("Number guessed correctly!");
            System.out.println("Attempts taken: " + attempts);
            System.out.println("Round score: " + score);

            totalscore += score;
            System.out.println("\nDo you want to play again? (yes/no): ");
            String choice = sc.next();

            if(!choice.equalsIgnoreCase("yes")){
                playagain = false;
            }
            
        }

        System.out.println("Game over");
        System.out.println("Total score: " + totalscore);
        System.out.println("Thank you for playing!");

        sc.close();
    }
}