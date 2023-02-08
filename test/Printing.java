package test; 

public class Printing {
  public static void main(String [] args) {
    System.out.println("Hello World!");
    System.out.print("I am having pasta ");
    System.out.println("for lunch today.");

    // println adds a new line after, print does not.
    System.out.println("\nMy name is Allan.");
    System.out.println("Name\tPhone");
    System.out.println("John\t123456");
    System.out.println("Ann\t\t123456");

    // Number after % sign represents number of spaces from the 
    // start of the terminal line to the end of the characters 
    System.out.format("%17.2f\n", 2.71828);
    System.out.format("%17.2f\n", 325.167); 
    System.out.format("%s%.1f %s", "Total price $", 
                      34.67, "per unit\n"); 
    // Hexadecimal
    System.out.format("%10x\n", 666);
    // Octadecimal 
    System.out.format("%10o\n", 666); 
    // ASCII Code 
    System.out.format("%10c\n", 68); 

    // ASCII Code
    System.out.println((int)'D'); 
  }
}