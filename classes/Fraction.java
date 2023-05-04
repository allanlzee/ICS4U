public class Fraction {
    protected int numerator = 0; 
    protected int denominator = 0; 
    protected boolean undefined = (denominator == 0); 

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

    public Fraction addFraction(Fraction other) {
        Fraction result = new Fraction(); 

        if (!this.undefined && !other.getUndefined()) {
            result.setNumerator(this.numerator * other.getDenominator() + 
                other.getNumerator() * this.denominator);  

            result.setDenominator(this.denominator * other.getDenominator()); 
        }

        return result; 
    }

    public Fraction subtractFraction(Fraction other) {
        Fraction result = new Fraction(); 

        if (!this.undefined && !other.getUndefined()) {
            result.setNumerator(this.numerator * other.getDenominator() - 
                other.getNumerator() * this.denominator); 

            result.setDenominator(this.denominator * other.getDenominator());
        }

        return result; 
    }

    public Fraction simplify() {
        Fraction result = new Fraction();
        int sign = 1; 

        if (!undefined) {
            if ((this.numerator < 0 || this.denominator < 0) && !(this.numerator < 0 && this.denominator < 0)) {
                sign = -1; 
            }

            int numerator = (int) Math.abs(this.numerator);
            int denominator = (int) Math.abs(this.denominator);

            int gcd = gcd(numerator, denominator);

            result.setNumerator(numerator / gcd * sign);
            result.setDenominator(denominator / gcd);
        }

        return result; 
    }

    private int gcd(int m, int n) {
        while (m != 0 && n != 0) {
            if (m > n) {
                m = m - n;
            } else {
                n = n - m; 
            }
        }

        if (m != 0) {
            return m;
        } else {
            return n; 
        }
    }

    @Override 
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
