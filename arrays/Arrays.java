package arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[2000]; 

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10000) + 1;
        }

        for (int i : numbers) {
            System.out.println(i);
        }

        System.out.println(numberInArray(500, numbers));
    }

    public static boolean numberInArray(int number, int[] numbers) {
        for (int i : numbers) {
            if (i == number) return true;
        }

        return false; 
    }
}
