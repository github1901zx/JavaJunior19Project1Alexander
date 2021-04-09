package homework.lesson.FigursOOP;


public class Сircle extends HomeWorkFigurs {

    private double radCircle;

    public Сircle (){

    }
    public Сircle (double rad){
        this.radCircle = rad;
    }

    @Override
    public String toString() {
        return "Сircle{" +
                "radCircle=" + radCircle +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Сircle сircle = (Сircle) o;

        return Double.compare(сircle.radCircle, radCircle) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radCircle);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public double getFigurePerimeter() {
        return ((2 * Math.PI) * radCircle);
    }

    @Override
    public double getFigureArea() {
        return (Math.PI * (radCircle * radCircle));
    }

    @Override
    public void figureIdentification() {
        System.out.println("Hi, it's class Сircle");
        System.out.println("radius " + radCircle );
        System.out.println("Area: " + getFigureArea());
        System.out.println("Perimeter: " + getFigurePerimeter());
    }

    public double getRadCircle() {
        return radCircle;
    }

    public void setRadCircle(double radCircle) {
        this.radCircle = radCircle;
    }

}
