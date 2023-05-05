

public class MixedNumber extends Fraction {
    private int integer = -1; 

    public MixedNumber() {
        super(); 
        this.integer = -1; 
    }

    public MixedNumber(int i, int n, int d) {
        super(n, d); 
        this.integer = i; 
    }

    public int getInteger() {
        return this.integer; 
    }

    public void setInteger(int integer) {
        this.integer = integer; 
    }

    public MixedNumber add(MixedNumber other) {
        MixedNumber result = new MixedNumber(); 

        Fraction improperThis = integer >= 0 ?
            new Fraction(integer * denominator + numerator, denominator) :
            new Fraction(integer * denominator - numerator, denominator); 

        Fraction improperOther = other.getInteger() >= 0 ? 
            new Fraction(
                other.getInteger() * other.getDenominator() + other.getNumerator(), other.getDenominator()) :
            new Fraction(
                other.getInteger() * other.getDenominator() - other.getNumerator(), other.getDenominator()); 

        if (!this.undefined && !improperOther.getUndefined()) {
            Fraction improperResult = improperThis.addFraction(improperOther).simplify(); 

            if (!improperResult.getUndefined()) {
                result.setInteger(improperResult.getNumerator() / improperResult.getDenominator());
                result.setNumerator(improperResult.getNumerator() - result.getInteger() * improperResult.getDenominator());
                result.setDenominator(improperResult.getDenominator());
            }
        }

        return result; 
    } 

    @Override 
    public String toString() {
        if (super.undefined) {
            return "undefined"; 
        } 

        else if (integer == 0 && super.numerator == 0) {
            return Globals.NULL_STRING + 0; 
        }

        else if (this.integer == 0) {
            return super.toString(); 
        }

        else if (super.numerator == 0) {
            return Globals.NULL_STRING + integer; 
        } 

        else {
            return integer + Globals.BLANK + super.toString(); 
        }
    }
}
