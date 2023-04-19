package arrays; 

public class Test {
    public static int[] uniqueEntries(int size) {
        int[] list = new int[size];

        for (int i = 0; i < list.length; i++) {
            list[i] = i + 1; 
        }

        for (int swapCount = 1; swapCount <= 2 * list.length; swapCount++) {
            int i = (int) (Math.random() * list.length); 
            int j = (int) (Math.random() * list.length); 

            Arrays.swap(list, i, j); 
        }

        return list; 
    }
}
