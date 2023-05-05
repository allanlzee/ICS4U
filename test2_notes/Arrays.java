package test2_notes;

public class Arrays {
    /* 
     * Arrays 
     * 
     * A collection of data of the same type 
     * 
     * First element starts at zero, size of array in property length 
     */

    /*
     * Not primitive, arrays are OBJECTS and must be instantiated 
     * 
     * Instantiating reserves memory for array 
     * 
     * If elements of array are primitives, memory is reserved for them when
     * the array is instantiated 
     * 
     * If elements of array are objects, objects must be instantiated separately 
     */

    public static void main(String...args) {
        int[] arr = new int[5]; 

        for (int i : arr) System.out.println(i);

        // Declares and instantiates a matrix of 2 rows and 3 columns 
        int[][] matrix = new int[2][3]; 

    }
}
