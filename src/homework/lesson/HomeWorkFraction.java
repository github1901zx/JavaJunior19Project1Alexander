package homework.lesson;

public class HomeWorkFraction {
    private int numerator;
    private int denominator;
    private int wholePart;

    public HomeWorkFraction() { //default

    }

    public HomeWorkFraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public HomeWorkFraction(int wholePart, int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.wholePart = wholePart;
    }


    public void setNumerator(int a) {
        this.numerator = a;
    }

    public void setDenominator(int b) {
        this.denominator = b;
    }

    public void setWholePart(int c) {
        this.wholePart = c;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getWholePart() {
        return wholePart; }

    public void printFraction() {
        if(wholePart == 0) {
            System.out.println( numerator + "/" + denominator);
        } else if(numerator == 0 || denominator == 0){
            System.out.println(wholePart);
        } else {
            System.out.println(wholePart +" "+ numerator + "/" + denominator);
        }
    }
}
