package lession13;

import java.util.ArrayList;

public class Main1 {

    public static void main(String[] args) {


        Matrix matrix = new Matrix(5, 5);
        Matrix matrix1 = new Matrix(5, 5);
        Matrix matrix2 = new Matrix(4, 4);


//        matrix2.setValueAt(0, 0, 1);
//        matrix2.setValueAt(0, 1, 2);
//        matrix2.setValueAt(0, 2, 6);
//        matrix2.setValueAt(1, 0, 4);
//        matrix2.setValueAt(1, 1, 3);
//        matrix2.setValueAt(1, 2, -1);
//        matrix2.setValueAt(2, 0, 2);
//        matrix2.setValueAt(2, 1, -2);
//        matrix2.setValueAt(2, 2, 5);

        matrix2.setValueAt(0, 0, -1);
        matrix2.setValueAt(0, 1, 2);
        matrix2.setValueAt(0, 2, -5);
        matrix2.setValueAt(1, 0, 4);
        matrix2.setValueAt(1, 1, -1);
        matrix2.setValueAt(1, 2, 3);
        matrix2.setValueAt(2, 0, 3);
        matrix2.setValueAt(2, 1, 0);
        matrix2.setValueAt(2, 2, -6);



        matrix.fillMatrix(1);
        matrix1.fillMatrix(2);


        System.out.println("----------isIdentityMatrix");
        System.out.println(matrix.isIdentityMatrix());
        System.out.println("----------isSquareMatrix");
        System.out.println(matrix.isSquareMatrix());
        System.out.println("----------isNullMatrix");
        System.out.println(matrix.isNullMatrix());
        System.out.println("---------------------add");
        matrix.add(matrix1).printToConsole();
        System.out.println("---------------------sub");
        matrix.sub(matrix1).printToConsole();
        System.out.println("---------------------mul");
        matrix.mul(matrix1).printToConsole();
        System.out.println("---------------------mulValue");
        matrix.mul(4).printToConsole();
        System.out.println("---------------------print");
        matrix2.transpose().printToConsole();
        System.out.println("---------------------det");
        System.out.println(matrix2.determinant());


    }
}
