package homework.lesson.FigursOOP;

public class Rectangle extends HomeWorkFigurs {
    private double sideRec1;
    private double sideRec2;
    private double sideRec3;
    private double sideRec4;

    public Rectangle(){

    }
    public Rectangle(double sideRec1,double sideRec2,double sideRec3,double sideRec4){

        this.sideRec1 = sideRec1;
        this.sideRec2 = sideRec2;
        this.sideRec3 = sideRec3;
        this.sideRec4 = sideRec4;
    }

    public double getSideRec1() {
        return sideRec1;
    }

    public void setSideRec1(double sideRec1) {
        this.sideRec1 = sideRec1;
    }

    public double getSideRec2() {
        return sideRec2;
    }

    public void setSideRec2(double sideRec2) {
        this.sideRec2 = sideRec2;
    }

    public double getSideRec3() {
        return sideRec3;
    }

    public void setSideRec3(double sideRec3) {
        this.sideRec3 = sideRec3;
    }

    public double getSideRec4() {
        return sideRec4;
    }

    public void setSideRec4(double sideRec4) {
        this.sideRec4 = sideRec4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.sideRec1, sideRec1) != 0) return false;
        if (Double.compare(rectangle.sideRec2, sideRec2) != 0) return false;
        if (Double.compare(rectangle.sideRec3, sideRec3) != 0) return false;
        return Double.compare(rectangle.sideRec4, sideRec4) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sideRec1);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideRec2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideRec3);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideRec4);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideRec1=" + sideRec1 +
                ", sideRec2=" + sideRec2 +
                ", sideRec3=" + sideRec3 +
                ", sideRec4=" + sideRec4 +
                '}';
    }

    @Override
    public double getFigureArea() {

        return sideRec1 * sideRec2;
    }

    @Override
    public double getFigurePerimeter() {
        return sideRec1 + sideRec2 + sideRec3 + sideRec4;
    }

    @Override
    public void figureIdentification() {
        System.out.println("Hi, it's class Rectangle");
        System.out.println("side1 " + sideRec1 + " " + "side2 " + sideRec2 + " " + "side3 " + sideRec3 + " " + " side4 " + sideRec4 );
        System.out.println("Area: " + getFigureArea());
        System.out.println("Perimeter: " + getFigurePerimeter());
    }
}
