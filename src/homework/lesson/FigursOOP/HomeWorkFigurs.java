package homework.lesson.FigursOOP;

public class HomeWorkFigurs {

    private double figureArea;
    private  double figurePerimeter;

    public HomeWorkFigurs(){

    };

    public double getFigureArea() {
        return figureArea;
    }

    public double getFigurePerimeter() {
        return figurePerimeter;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HomeWorkFigurs that = (HomeWorkFigurs) o;

        if (Double.compare(that.figureArea, figureArea) != 0) return false;
        return Double.compare(that.figurePerimeter, figurePerimeter) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(figureArea);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(figurePerimeter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "HomeWorkFigurs{" +
                "figureArea =" + figureArea +
                ", figurePerimeter =" + figurePerimeter +
                '}';
    }
    public void figureIdentification (){
        System.out.println("Hi, it's class HomeWorkFigurs");
    }
}
