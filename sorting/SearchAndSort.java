package sorting;

import arrays.Test;

public class SearchAndSort {
    public static void main(String[] args) {
        int[] list = Test.uniqueEntries(20); 

        printArray(list);

        System.out.println();

        printArray(insertionSort(list));
    }

    public static void printArray(int[] list) {
        for (int n : list) 
            System.out.print(n + " ");
    }

    public static void swapNumbers(int[] numbers, int i, int j) {
        int temp = numbers[i]; 
        numbers[i] = numbers[j]; 
        numbers[j] = temp; 
    }

    public static int indexOfLargest(int[] numbers, int end) {
        int largestIndex = 0; 
        int largestNum = numbers[0]; 

        for (int i = 1; i <= end; i++) {
            if (numbers[i] > largestNum) {
                largestIndex = i;
                largestNum = numbers[i]; 
            }
        }

        return largestIndex;
    }
     
    public static int[] selectionSort(int[] numbers) {
        for (int i = numbers.length - 1; i >= 1; i--) {
            int largestIndex = indexOfLargest(numbers, i); 

            swapNumbers(numbers, i, largestIndex);
        }

        return numbers; 
    }

    // Insertion Sort // 
    public static void rotateList(int[] list, int start, int end) {
        int temp = list[end]; 

        for (int i = end; i > start; i--) {
            list[i] = list[i - 1];
        }

        list[start] = temp; 
    }

    public static int[] insertionSort(int[] numbers) {
        for (int current = 1; current < numbers.length; current++) {
            int i = 0; 

            for(; i < current && numbers[i] < numbers[current]; i++); 

            rotateList(numbers, i, current);
        }

        return numbers; 
    }
}
