package test; 

public class Multiply {
  public static void main(String[] args) {
    Multiply test = new Multiply(); 
    test.multiply1();
    test.multiply2(); 
    test.multiply3(); 
  }

  public void multiply1() {
    System.out.print("3 + 2 = "); 
    System.out.print(3 + 2);
    System.out.println();
  }

  public void multiply2() {
    System.out.println("3 + 2 = " + (3 + 2));
  }

  public void multiply3() {
    System.out.println("3 + 2 = " + 3 + 2);
  }
}