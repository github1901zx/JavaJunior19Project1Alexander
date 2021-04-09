package lession7;

public class Main2 {
    public static void main(String[] args) {

        int [] [] numbers1 = {{2,3,4},{5,6,7},{8,9,0}};
        int [] [] numbers2 = {{0,9,8},{7,6,5},{4,3,2}};

        boolean isSquareMat = MatrixUtils.isSquareMatrix(numbers1);
        System.out.println(isSquareMat);

        boolean isIdentityMat = MatrixUtils.isIdentityMatrix(numbers2);
        System.out.println(isIdentityMat);
    }
}
