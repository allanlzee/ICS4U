package iteration;

import java.util.Scanner;

public class While {
    // 4.1.2 Exercises 2, 4, 5, 6, 8
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Q8(scan); 

        scan.close();
    }

    public static void Q2(Scanner scan) {
        int number = -99;

        int sum = 0;

        do {
            number = scan.nextInt();

            if (number != -99)
                sum += number;
        } while (number != -99);

        System.out.println(sum);
    }
    
    public static void Q4(Scanner scan) {
        String c = "Q";

        do {
            c = scan.next().trim();

            if (c.length() == 1) {
                char d = c.charAt(0);

                if ('Z' >= d && d >= 'A')
                    System.out.println("valid command");
                else
                    System.out.println("invalid command");
            } else {
                System.out.println("invalid command");
            }

        } while (c != "Q");
    }
    
    public static void Q5(Scanner scan) {
        System.out.print("Enter number to guess: ");
        int num = scan.nextInt();

        System.out.println("\033[H\033[2J");

        int numGuesses = 0;
        int guess = 0;

        do {
            System.out.print("Enter a guess: ");
            guess = scan.nextInt();

            numGuesses++;

            if (guess < num)
                System.out.println("Your guess is too small. Try a larger number");
            else if (guess > num)
                System.out.println("Your guess is high. Try a smaller number");
            else
                System.out.println("You guessed in " + numGuesses + " tries");
        } while (guess != num);
    }
    
    public static void Q6(Scanner scan) {
        int num = (int) (Math.random() * 40); 

        int numGuesses = 0;
        int guess = 0;

        do {
            System.out.print("Enter a guess: ");
            guess = scan.nextInt();

            numGuesses++;

            if (guess < num)
                System.out.println("Your guess is too small. Try a larger number");
            else if (guess > num)
                System.out.println("Your guess is high. Try a smaller number");
            else
                System.out.println("You guessed in " + numGuesses + " tries");
        } while (guess != num);
    }

    public static void Q8(Scanner scan) {
        int num = (int) (Math.random() * 100);

        int numGuesses = 0;
        int guess = 0;

        int low = 0;
        int high = 100; 

        do {
            System.out.println("Best guess: " + (low + high) / 2);

            System.out.print("Enter a guess: ");
            guess = scan.nextInt();

            numGuesses++;

            if (guess < num) {
                System.out.println("Your guess is too small. Try a larger number");
                low = guess;
            }
            else if (guess > num) {
                System.out.println("Your guess is high. Try a smaller number");
                high = guess;
            }
            else
                System.out.println("You guessed in " + numGuesses + " tries");
        } while (guess != num);
    }
}
