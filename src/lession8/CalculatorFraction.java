package lession8;

public class CalculatorFraction {

    public static Fraction sumFraction (Fraction fraction, Fraction fraction1){
        int commonDenominator = fraction.getDenominator()* fraction1.getDenominator();
        int commonNumerator = fraction.getNumerator() * fraction1.getDenominator()
                + fraction.getDenominator() * fraction1.getNumerator();

        Fraction result = new Fraction(commonNumerator,commonDenominator);

        return result;
    }

}
