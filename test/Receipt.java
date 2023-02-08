package test; 

public class Receipt {
  public static void main(String[] args) {
    System.out.format("%s%16d\n", "One", 1);
    System.out.format("%s%16d\n", "Ten", 10); 
    System.out.format("%s%12d\n", "Hundred", 100); 
    System.out.format("%s%15.2f\n", "Hundred", 100.00); 
    System.out.format("%s%14.2f\n", "Thousand", 3645.00); 
    System.out.format("%s%12.3f\n", "Thousandths", 0.342); 
  }
}