package sorting;

import arrays.Test;

public class Test2 {
    public static void main(String[] args) {
        int[] list = Test.uniqueEntries(20); 
        
        SearchAndSort.printArray(list);
        System.out.println();

        SearchAndSort.bubbleSort(list); 

        SearchAndSort.printArray(list);
        System.out.println();

        System.out.println(SearchAndSort.binarySearch(list, 5)); 
    }
}
