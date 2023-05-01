public class Fraction {
    private int numerator = 0; 
    private int denominator = 0; 
    private boolean undefined = (denominator == 0); 

    public Fraction() {
        this.numerator = 0;
        this.denominator = 0;
        this.undefined = (denominator == 0);
    }
    
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator; 
        this.denominator = denominator; 
        this.undefined = (denominator == 0);
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator; 
    }

    public int getNumerator() {
        return this.numerator; 
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator; 

        this.undefined = (denominator == 0);
    }

    public int getDenominator() {
        return this.denominator; 
    }

    public void setUndefined(boolean undefined) {
        this.undefined = undefined; 
    }

    public boolean getUndefined() {
        return this.undefined; 
    }

    public Fraction multiply(Fraction other) {
        Fraction result = new Fraction(); 

        result.setNumerator(this.numerator * other.getNumerator());

        result.setDenominator(this.denominator * other.getDenominator()); 

        return result;         
    }

    public Fraction divide(Fraction other) {
        return this.multiply(other.reciprocate());
    }

    public Fraction reciprocate() {
        Fraction result = new Fraction(); 

        if (this.numerator != 0 && !this.undefined) {
            result.setNumerator(this.denominator); 
            result.setDenominator(this.numerator);
        } 

        return result; 
    }

    public String toString() {
        if (undefined) {
            return "undefined";
        }
        
        else if (denominator == 1) {
            return Globals.NULL_STRING + numerator; 
        }

        else {
            return numerator + "/" + denominator; 
        }
    }
}
