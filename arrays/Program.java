package arrays;

/* 
 * A Java class that calls upon a function within another class only compiles when: 
 * - The other class has also been compiled into a class file OR 
 * - The other class has the Java file existing in the directory 
 * 
 * Otherwise, the program will not compile since it cannot find the desired method. 
 */

public class Program {
    public static void main(String[] args) {
        int[] list = Test.uniqueEntries(20);

        for (int c : list) {
            System.out.println(c);
        }
    }
}
