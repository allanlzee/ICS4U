public class FractionMain {
    public static void main(String[] args) {
        /* Fraction f1 = new Fraction(5, 9); 

        System.out.println(f1.toString()); 

        Fraction f2 = new Fraction(6, 1);

        System.out.println(f2.toString());

        System.out.println(f1.multiply(f2)); 
        System.out.println(f1.divide(f2)); */ 
        // f1 is an implicit parameter - its information is implicitly given when the function is called 
        // f2 is an explicit parameter - its information must be passed to the function 

        Fraction f1 = new Fraction(24, 6); 

        Fraction f2 = new Fraction(1, 2); 

        Fraction f3 = f1.addFraction(f2).simplify(); 

        System.out.println(f3);

        System.out.println(f3.divide(f1).simplify());
    }
}
