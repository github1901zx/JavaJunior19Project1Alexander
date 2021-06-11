package practic;

public class Vector {
    private int coordXVec;
    private int coordYVec;
    private int coordZVec;

    public Vector() {
        //
    }

    public Vector(int coordX, int coordY, int coordZ) {
        this.coordXVec = coordX;
        this.coordYVec = coordY;
        this.coordZVec = coordZ;
    }

    public void setCoordXVec(int coordXVec) {
        this.coordXVec = coordXVec;
    }

    public void setCoordYVec(int coordYVec) {
        this.coordYVec = coordYVec;
    }

    public void setCoordZVec(int coordZVec) {
        this.coordZVec = coordZVec;
    }

    public int getCoordXVec() {
        return coordXVec;
    }

    public int getCoordYVec() {
        return coordYVec;
    }

    public int getCoordZVec() {
        return coordZVec;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector)) return false;

        Vector vector = (Vector) o;

        if (coordXVec != vector.coordXVec) return false;
        if (coordYVec != vector.coordYVec) return false;
        return coordZVec == vector.coordZVec;
    }

    @Override
    public int hashCode() {
        int result = coordXVec;
        result = 31 * result + coordYVec;
        result = 31 * result + coordZVec;
        return result;
    }

    @Override
    public String toString() {
        return "Vector " + " coordXVec " + coordXVec + " coordYVec " + coordYVec + " coordZVec " + coordZVec;
    }

    public double leanghtVector() {
        return Math.sqrt(Math.pow(coordXVec, 2) + Math.pow(coordYVec, 2) + Math.pow(coordZVec, 2));
    }

    public double scalarVector(Vector vector1) {
        return vector1.getCoordXVec() * coordXVec + vector1.getCoordYVec() * coordYVec + vector1.getCoordZVec() * coordZVec;
    }

//    public double crossProduct (Vector vector1){ //скалярное произведение вектора
//
//        double coordCrossProductX =0;
//        double coordCrossProductY =0;
//        double coordCrossProductZ =0;
//
//        return 0;
//     }
}
