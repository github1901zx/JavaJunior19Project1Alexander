package lession14;

public class Coin {

    private double diametr;
    private int year;
    private int nominal;

    public Coin() {
    }

    public Coin(double diametr, int year, int nominal) {
        this.diametr = diametr;
        this.year = year;
        this.nominal = nominal;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    @Override
    public String toString() {
        return "Coin " +
                "diametr = " + diametr +
                "year = " + year +
                "nominal = " + nominal ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (Double.compare(coin.diametr, diametr) != 0) return false;
        if (year != coin.year) return false;
        return nominal == coin.nominal;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(diametr);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + year;
        result = 31 * result + nominal;
        return result;
    }
}
