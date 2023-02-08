package lab1_3; 

public class EquationOfLine {
  public static void main(String[] args) {
    double x1 = 5, y1 = 1, x2 = -3, y2 = 5; 

    // Slope = (y2 - y1) / (x2 - x1) 
    double slope = (y2 - y1) / (x2 - x1); 

    /* Line: y = mx + b 
    m represents the slope of the line, 
    b represents the y-intercept of the line 
    */ 
    double b = y2 - slope * x2; 

    System.out.format(
      "Equation of the line through (%.0f, %.0f) " + 
      "and (%.0f, %.0f) is y = %.1fx + %.1f", 
      x1, y1, x2, y2, slope, b
    ); 
  }
}