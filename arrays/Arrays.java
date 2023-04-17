package arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        /* int[] numbers = new int[2000]; 

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10000) + 1;
        }

        for (int i : numbers) {
            System.out.println(i);
        }

        System.out.println(numberInArray(500, numbers)); */ 

        /* String[] phoneNumbers = new String[10];
        
        phoneNumbers[0] = "416-716-7752";
        phoneNumbers[1] = "416-717-9062";
        phoneNumbers[2] = "416-696-3633";
        phoneNumbers[3] = "416-304-2056";
        phoneNumbers[4] = "416-102-1114";
        phoneNumbers[5] = "416-888-5036";
        phoneNumbers[6] = "416-432-7604";
        phoneNumbers[7] = "416-254-6135";
        phoneNumbers[8] = "416-865-4679";
        phoneNumbers[9] = "416-001-3632";
 

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a phone number: ");

        String phone = scan.next(); 

        int index = linearSearch(phoneNumbers, phone);

        if (index != -1) {
            System.out.println("Index: " + index);
            System.out.println("Phone Number: " + phone);
        } else {
            System.out.println("Phone number not found");
        }

        scan.close(); */

        int[] list = {1, 2, 3, 4, 5}; 
        shiftN(list, 3); 
        
    }

    public static boolean numberInArray(int number, int[] numbers) {
        for (int i : numbers) {
            if (i == number) return true;
        }

        return false; 
    }

    /**
     * Returns index of a specified number in an array. 
     * Otherwise, the function returns -1.
     * 
     * @param array
     * @param number
     * @return
     */
    public static int linearSearch(int[] array, int number) {
        int i = 0; 

        for (; i < array.length && number != array[i]; i++); 

        return i != array.length ? i : -1; 
    }

    public static int linearSearch(String[] array, String phone) {
        int i = 0; 

        for (; i < array.length && !phone.equals(array[i]); i++) {
            System.out.println(i);
        }

        return i != array.length ? i : -1; 
    }

    public static void startsWith(String[] array, String start) {
        int counter = 0; 

        for (int i = 0; i < array.length; i++) {
            if (array[i].substring(0, start.length()).equals(start)) {
                System.out.println(array[i]);
                counter++;
            }
        }

        System.out.println(counter + "items found");
    }

    public static void shiftOne(int [] list, int d) {
        if (d > 0) { // Shift right 
            int temp = list[list.length - 1]; 

            for (int i = list.length - 2; i >= 0; i--) {
                list[i + 1] = list[i];
            }

            list[0] = temp; 
        } else if (d < 0) { // Shift left 
            int temp = list[0]; 

            for (int i = 0; i < list.length - 1; i++) {
                list[i] = list[i + 1]; 
            }

            list[list.length - 1] = temp; 
        }

        for (int a : list) System.out.println(a);
    }

    public static void shiftN(int [] list, int n) {
        for (int i = 0; i < Math.abs(n); i++) {
            shiftOne(list, n);
        }
    }

    public static void swap(int[] list, int i, int j) {
        int temp = list[i]; 
        list[i] = list[j]; 
        list[j] = temp; 
    }
    
}
