package lession11;

public class FourSquares {
    private int a;
    private int b;
    private int c;
    private int d;

    public FourSquares() {

    }

    public FourSquares(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
/** документрирование для компазиции*/
//    public int getA() {
//        return a;
//    }
//
//    public void setA(int a) {
//        this.a = a;
//    }
//
//    public int getB() {
//        return b;
//    }
//
//    public void setB(int b) {
//        this.b = b;
//    }
//
//    public int getC() {
//        return c;
//    }
//
//    public void setC(int c) {
//        this.c = c;
//    }
//
//    public int getD() {
//        return d;
//    }
//
//    public void setD(int d) {
//        this.d = d;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        FourSquares that = (FourSquares) o;
//
//        if (a != that.a) return false;
//        if (b != that.b) return false;
//        if (c != that.c) return false;
//        return d == that.d;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = a;
//        result = 31 * result + b;
//        result = 31 * result + c;
//        result = 31 * result + d;
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        return "FourSquares:" +
//                "\n" + " a = " + a +
//                "\n" + " b = " + b +
//                "\n" + " c = " + c +
//                "\n" + " d = " + d;
//    }

    public int pirimitr() {
        return a + b + c + d;
    }

    public double area() {
        double p = this.pirimitr()/2;
        return Math.sqrt((p - a) * (p - b) * (p - c) * (p - d));
    }
}
