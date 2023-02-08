package test; 

public class Divide {
  public static void main(String[] args) {
    divide1();
    divide2();
  }

  public static void divide1() {
    System.out.println("12 / 11 = " + 12 / 11);
  }

  public static void divide2() {
    System.out.println("12 / 11 = " + 12.0 / 11);
  }
}