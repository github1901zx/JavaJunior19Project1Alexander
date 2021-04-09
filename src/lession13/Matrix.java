package lession13;

public class Matrix implements IMatrix {

    private double[][] matrix;

    public Matrix(int row, int collum) {
        matrix = new double[row][collum];
    }

    @Override
    public int getRows() {
        return matrix.length;
    }

    @Override
    public int getColumns() {
        return matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return matrix[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        matrix[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        Matrix mtr = new Matrix(getRows(), getColumns());

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                mtr.setValueAt(i, j, this.matrix[i][j] + otherMatrix.getValueAt(i, j));
            }
        }
        return mtr;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        Matrix mtr = new Matrix(getRows(), getColumns());

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                mtr.setValueAt(i, j, this.matrix[i][j] - otherMatrix.getValueAt(i, j));
            }
        }
        return mtr;
    }


    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        Matrix mtr = new Matrix(getRows(), getColumns());

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                mtr.setValueAt(i, j, this.matrix[i][j] * otherMatrix.getValueAt(j, i)
                        + this.matrix[i][j] * otherMatrix.getValueAt(j, i)
                        + this.matrix[i][j] * otherMatrix.getValueAt(j, i));
            }
        }
        return mtr;
    }

    @Override
    public IMatrix mul(double value) {
        Matrix mtr = new Matrix(getRows(), getColumns());

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                mtr.setValueAt(i, j, this.matrix[i][j] * value);
            }
        }
        return mtr;
    }

    @Override
    public IMatrix transpose() {

        Matrix mtr = new Matrix(getRows(), getColumns());

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                mtr.setValueAt(i, j, this.matrix[j][i]);
            }
        }
        return mtr;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value;
            }
        }

    }

    @Override
    public double determinant() {

        Matrix mtr = new Matrix(getRows(), getColumns() + 2);

        double value = 0;
        double x = 1;
        double y = 1;
        double z = 1;
        double q = 1;
        double w = 1;
        double t = 1;


        for (int i = 0; i < mtr.getRows(); i++) {//заполняем новую матрицу
            int m = 0;
            for (int j = 0; j < mtr.getColumns(); j++) {
                if (m == matrix[i].length) {
                    m = 0;
                }
                value = matrix[i][m];
                mtr.setValueAt(i, j, value);
                m++;
            }
        }

        for (int i = 0; i < mtr.getRows(); i++) { //сумма правильных диагоналей
            for (int j = 0; j < mtr.getColumns(); j++) {
                if (i == j) {
                    x = x * mtr.getValueAt(i, j);
                }
                if (i + 1 == j) {
                    y = y * mtr.getValueAt(i, j);
                }
                if (i + 2 == j) {
                    z = z * mtr.getValueAt(i, j);
                }
            }
        }

        for (int i = 0; i < mtr.getRows(); i++) { // сумма не правильных диагоналей
            for (int j = 0; j < mtr.getColumns(); j++) {
                if (i + j == mtr.getColumns() - 3) {
                    q = q * mtr.getValueAt(i, j);
                }
                if (i + j == mtr.getColumns() - 2) {
                    w = w * mtr.getValueAt(i, j);
                }
                if (i + j == mtr.getColumns() - 1) {
                    t = t * mtr.getValueAt(i, j);
                }
            }
        }
        return x + y + z - q - w - t;
    }


    @Override
    public boolean isNullMatrix() {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
                if (i == j && matrix[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        if (getColumns() == getRows()) {
            return true;
        }
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }


    }
}
