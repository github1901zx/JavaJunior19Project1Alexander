package homework.lesson.FigursOOP;

public class Square extends HomeWorkFigurs {

    private double sideSq1;
    private double sideSq2;
    private double sideSq3;
    private double sideSq4;

    public Square (){

    }
    public Square (double sideSq1,double sideSq2,double sideSq3,double sideSq4){
        this.sideSq1= sideSq1;
        this.sideSq2= sideSq2;
        this.sideSq3= sideSq3;
        this.sideSq4= sideSq4;
    }

    public double getSideSq1() {
        return sideSq1;
    }

    public void setSideSq1(double sideSq1) {
        this.sideSq1 = sideSq1;
    }

    public double getSideSq2() {
        return sideSq2;
    }

    public void setSideSq2(double sideSq2) {
        this.sideSq2 = sideSq2;
    }

    public double getSideSq3() {
        return sideSq3;
    }

    public void setSideSq3(double sideSq3) {
        this.sideSq3 = sideSq3;
    }

    public double getSideSq4() {
        return sideSq4;
    }

    public void setSideSq4(double sideSq4) {
        this.sideSq4 = sideSq4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Square square = (Square) o;

        if (Double.compare(square.sideSq1, sideSq1) != 0) return false;
        if (Double.compare(square.sideSq2, sideSq2) != 0) return false;
        if (Double.compare(square.sideSq3, sideSq3) != 0) return false;
        return Double.compare(square.sideSq4, sideSq4) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideSq1);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideSq2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideSq3);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideSq4);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideSq1=" + sideSq1 +
                ", sideSq2=" + sideSq2 +
                ", sideSq3=" + sideSq3 +
                ", sideSq4=" + sideSq4 +
                '}';
    }

    @Override
    public double getFigurePerimeter() {
        return sideSq1 + sideSq2 + sideSq3 + sideSq4;
    }

    @Override
    public double getFigureArea() {
        return sideSq1 * sideSq2;
    }

    @Override
    public void figureIdentification() {
        System.out.println("Hi, it's class Square");
        System.out.println("side1 " + sideSq1 + " " + "side2 " + sideSq2 + " " + "side3 " + sideSq3 + " " + " side4 " + sideSq4 );
        System.out.println("Area: " + getFigureArea());
        System.out.println("Perimeter: " + getFigurePerimeter());
    }
}
