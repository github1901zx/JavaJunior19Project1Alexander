package homework.lesson.FigursOOP;

public class Ellipse extends HomeWorkFigurs {
    private  double radEll1;
    private  double radEll2;

    public Ellipse(){

    }
    public Ellipse(double rad1, double rad2){
        this.radEll1 = rad1;
        this.radEll2 = rad2;
    }

    public double getRadEll1() {
        return radEll1;
    }

    public void setRadEll1(double radEll1) {
        this.radEll1 = radEll1;
    }

    public double getRadEll2() {
        return radEll2;
    }

    public void setRadEll2(double radEll2) {
        this.radEll2 = radEll2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Ellipse ellipse = (Ellipse) o;

        if (Double.compare(ellipse.radEll1, radEll1) != 0) return false;
        return Double.compare(ellipse.radEll2, radEll2) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radEll1);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(radEll2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "radEll1=" + radEll1 +
                ", radEll2=" + radEll2 +
                '}';
    }

    @Override
    public double getFigureArea() {
        return (Math.PI * (radEll1 * radEll2));
    }

    @Override
    public double getFigurePerimeter() {
        return (2 * Math.PI * Math.sqrt(((radEll1 * radEll1) + (radEll2 * radEll2)) / 2));
    }

    @Override
    public void figureIdentification() {
        System.out.println("Hi, it's class Ellipse");
        System.out.println("radius1 " + radEll1 + " radius2 " + radEll2 );
        System.out.println("Area: " + getFigureArea());
        System.out.println("Perimeter: " + getFigurePerimeter());
    }
}
