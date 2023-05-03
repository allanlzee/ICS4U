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
