package lession7;

public class Main {
    public static void main(String[] args) {
        int [] [] numbers = {{2,3,4,5,7},// первая строка массива {{}{}{}} правильная запись
                {4,1,2,9,0},// вторая строка массива
                {0,3,2,8,8}};//третья строка массива
        for (int i = 0 ; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
