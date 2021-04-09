package lession8;

public class Fraction {
    private int numerator;/**числитель*/
    private int denominator;/**знаменатель*/

    public Fraction(){/**Констрктор по умолчанию*/

    }

    public Fraction(int fraction, int denominator){/**Конструктор*/
        this.denominator = denominator;
        this.numerator = fraction;
    }

    public void setFraction (int a){/** изменяет значение числителя*/
        this.numerator = numerator;
    }

    public void setDenominator (int b){
        this.denominator = denominator;
    }

    public int getNumerator(){/** возвращает значание числителя*/
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void printFraction(){
        System.out.println(numerator +"/"+ denominator);
    }

}
