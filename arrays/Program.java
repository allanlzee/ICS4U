package arrays;


public class Program {
    public static void main(String[] args) {
        int[] list = new int[20]; 

        Test.uniqueEntries(list);

        for (int c : list) {
            System.out.println(c);
        }
    }
}
