package homework.lesson.FigursOOP;

public class Triangle extends HomeWorkFigurs {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {// default constryctor

    }

    public Triangle(double side1, double side2, double side3) {
        this.sideA = side1;
        this.sideB = side2;
        this.sideC = side3;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {

        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {

        this.sideB = sideB;
    }

    public double getSideC() {

        return sideC;
    }

    public void setSideC(double sideC) {

        this.sideC = sideC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.sideA, sideA) != 0) return false;
        if (Double.compare(triangle.sideB, sideB) != 0) return false;
        return Double.compare(triangle.sideC, sideC) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Triangle:" +
                "sideA =" + sideA +
                ", sideB =" + sideB +
                ", sideC =" + sideC +
                '}';
    }

    @Override
    public void figureIdentification() {
        System.out.println("Hi, it's class Triangle");
        System.out.println("sideA " + sideA + " " + "sideB " + sideB + " " + "sideC " + sideC );
        whatTriangular();
        System.out.println("Area: " + getFigureArea());
        System.out.println("Perimeter: " + getFigurePerimeter());
    }

    @Override
    public double getFigurePerimeter() {

        return sideA + sideB + sideC;
    }

    @Override
    public double getFigureArea() {
        double halfperimeter = (sideA+sideB+sideC)/2;
       return Math.sqrt(halfperimeter * ( halfperimeter - sideA ) * ( halfperimeter - sideB ) * ( halfperimeter - sideC));
    }
    public void whatTriangular(){
        if(sideA == sideB && sideB == sideC){
            System.out.println("equilateral triangle");
        } else if(sideA == sideB || sideB == sideC || sideA == sideC){
            System.out.println("isosceles triangle");
        } else {
            System.out.println("versatile triangle");
        }

    }
}


