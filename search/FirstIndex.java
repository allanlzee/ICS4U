package search;

import sorting.SearchAndSort;

public class FirstIndex {
    public static void main(String[] args) {
        int[] items = {5};

        System.out.println(findFirst(items, 4));

        int[] items2 = new int[4]; 

        System.out.println(SearchAndSort.binarySearch(items2, 0));
    }

    public static int findFirst(int[] items, int key) {
        int index = SearchAndSort.binarySearch(items, key);
        System.out.println(index);

        int firstIndex = index; 

        if (index != -1) {
            for (; firstIndex > 0 && items[firstIndex - 1] == key; firstIndex--);
        }

        return firstIndex;
    }
}
