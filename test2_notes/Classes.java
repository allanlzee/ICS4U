package test2_notes;

public class Classes {
    /* 
     * Unit 5: Classes in Java 
     * 
     * A class can contain constants, variables, methods, and other classes 
     * 
     * Java uses class file names to find methods, objects, and variables...
     * (the class name and file name have to be the same)
     */

    /* 
     * Constant Definition Classes 
     * 
     * Maintains a common location of all constants used throughout a program 
     * 
     * All public constants placed become accessible to all other classes residing in the same folder/directory 
     * 
     * Variables should be static (you do not have to instantiate a new object)
     * 
     * Constants should be capitalized fully
     */

    /*
     * Static Method Classes 
     * 
     * Keep methods of a common type together 
     * 
     * DOES NOT contain a main() method 
     * 
     * Public methods placed here become accessible to all other classes residing in the same folder/directory 
     * 
     * Can contain private methods only available to the methods within the class 
     */

    /*
     * Object Defining Classes 
     * 
     * Variables and methods determining the properties and behaviours of the object 
     * 
     * Contains constructor(s), non-static methods 
     * 
     * Variables should be private/protected (for inheritance)
     * 
     * A default constructor and a constructor that takes parameters are required 
     */

    /* 
     * toString() 
     * 
     * Part of the Object class 
     * 
     * Can be overridden by objects 
     * 
     * Called within System.out.println() 
     */

    /*
     * Access Methods 
     * 
     * Variables in a class are declared private 
     * 
     * Not directly accessible from outside the object, can be accessed through access methods (getters and setters)
     * 
     */
}
