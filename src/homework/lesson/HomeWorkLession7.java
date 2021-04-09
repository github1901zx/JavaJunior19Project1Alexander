package homework.lesson;


public class HomeWorkLession7 {
    public static void main(String[] args) {

        int[][] numbers = new int[6][6];
        int nums = 10;


        System.out.println("Заполняем массив числами");

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = nums;
                nums = nums + 2;
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Выводим массив в шахматном порядке");
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");
                } else if (i % 2 != 0 && j % 2 != 0) {
                    System.out.print(numbers[i][j] + " ");
                } else if (i % 2 == 0 && j % 2 != 0 || i % 2 != 0 && j % 2 == 0) {
                    System.out.print("  ");
                } /**
                 можно было написать просто
                 else{
                 System.out.print("  ")
                 }
                 для наглядности логики переписал на два else if
                 */
            }
            System.out.println(" ");
        }
        System.out.println("Выводим массив треугольником ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                int lineLenght = numbers[i].length / 2;

                if (i < numbers.length / 2) {
                    if (j < lineLenght - i) {
                        System.out.print("   ");
                    } else if (j <= lineLenght + i) {
                        System.out.print(numbers[i][j] + " ");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(" ");
        }
        System.out.println("Выводим массив ромбом ");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                int lineLenght = numbers[i].length / 2;

                if (i < numbers.length / 2) {
                    if (j < lineLenght - i) {
                        System.out.print("   ");
                    } else if (j <= lineLenght + i) {
                        System.out.print(numbers[i][j] + " ");
                    } else {
                        System.out.print("");
                    }
                }
                if (i >= numbers.length / 2) {
                    if (j + i >= (lineLenght * 2) + 2 || i >j + 1) {
                        System.out.print("   ");
                    } else  {
                        System.out.print(numbers[i][j] + " ");
                    }
                }
            }
            System.out.println(" ");
        }
        System.out.println("Выводим обратную диагональ");


        for(int i = 0; i < numbers.length; i++){

            for(int j = 0; j < numbers[i].length; j++){
              if(i+j == numbers.length-1){
                  System.out.print(numbers[i][j]);
              }  else {
                  System.out.print("   ");
              }
            }
            System.out.println(" ");
        }
        System.out.println("Romb");

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){

                int lineLenght = numbers[i].length / 2;

                    if(i+j < lineLenght  /**left up*/
                            || i+j >= numbers.length + 2  /**right down*/
                            || i >= j + 4  /**left down*/
                            || i + 2 <= j ){  /** right up */
                        System.out.print("    ");
                    }else {
                        System.out.print(numbers[i][j] + "  ");
                    }

            }
            System.out.println(" ");
        }


    }
}





