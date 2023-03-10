package iteration;

import java.util.Scanner;

public class Practice {
    // 4.1.1 Exercises 2, 3, 4, 10, 11, 12
    // 4.1.2 Exercises 2, 4, 5, 6, 8

    public static void main(String[] args) {
        Q12();
    }

    public static void Q2() {
        System.out.format("%6s%12s%20s\n", "Number", "Square", "Cube");

        for (int i = 1; i <= 5; i++) {
            System.out.format("%6d%12d%20d\n",
                    i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
        }
    }

    public static void Q3() {
        Scanner scan = new Scanner(System.in);

        double largest = 0;

        for (int i = 0; i < 10; i++) {
            double num = scan.nextDouble();

            largest = num > largest ? num : largest;
        }

        System.out.println("The largest number: " + largest);
        scan.close();
    }

    public static void Q4() {
        for (int i = 1; i <= 4; i++) {
            System.out.format("%d + %d = %d\n", i, i, i + i);
        }
    }

    public static void Q10() {
        double first = 1;
        double second = 1;

        System.out.println(first);
        System.out.println(second);

        for (int i = 0; i < 48; i++) {
            double next = first + second;
            System.out.println(next);

            first = second;
            second = next;
        }
    }

    public static void Q11() {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for (int factor = 1; factor <= Math.ceil(Math.sqrt(num)); factor++) {
            if (num % factor == 0) {
                System.out.print(factor + ", ");

                if (!(num / factor == Math.ceil(Math.sqrt(num))))
                    System.out.println(num / factor);
            }
        }

        System.out.println(num);

        scan.close();
    }

    public static void Q12() {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        boolean isPrime = true;

        for (int factor = 2; factor <= Math.ceil(Math.sqrt(num)); factor++) {
            if (num % factor == 0) {
                isPrime = false;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");

        scan.close();
    }
}