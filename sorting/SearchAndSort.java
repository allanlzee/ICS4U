package sorting;

import arrays.Test;

public class SearchAndSort {
    public static void main(String[] args) {
        int[] list = Test.uniqueEntries(20); 

        printArray(list);

        System.out.println();

        printArray(bubbleSort(list));

        /* int[] nums = Test.uniqueEntries(1000); 

        printArray(nums);

        selectionSort(nums); 

        System.out.println();

        printArray(nums);

        long start = System.currentTimeMillis();
        System.out.println(binarySearch(nums, 33));
        long end = System.currentTimeMillis(); 
        System.out.println("\nTime: " + (end - start)); */ 


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

    public static int binarySearch(int[] numbers, int key) {
        int start = 0; 
        int end = numbers.length - 1; 
        int index = (start + end) / 2; 

        while (key != numbers[index] && start <= end) {
            if (key > numbers[index]) {
                start = index + 1; 
            } else if (key < numbers[index]) {
                end = index - 1;
            } 

            index = (start + end) / 2; 
        }

        // Cannot use key == numbers[index]: results in index out of bounds error.

        return start > end ? -1 : index;
    }

    public static int[] bubbleSort(int[] items) {
        boolean swap = true; 

        for (int limit = items.length - 1; limit > 0 && swap; limit--) {
            swap = false; 

            for (int index = 0; index <= limit - 1; index++) {
                if (items[index] > items[index + 1]) {
                    swapNumbers(items, index, index + 1);
                    swap = true; 
                } 
            }
        }

        return items;
    }

}
