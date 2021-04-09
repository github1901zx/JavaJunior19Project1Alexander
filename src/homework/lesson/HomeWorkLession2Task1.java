package homework.lesson;

public class HomeWorkLession2Task1 {
    public static void main(String[] args) {
        int figureSideA = 5;
        int figureSideB = 4;
        int figureSideC = 4;
        int figureSideE = 4;

        if (figureSideA == figureSideB && figureSideB == figureSideC && figureSideC == figureSideE) {
            System.out.println("Квадрат");
        } else if (figureSideA == figureSideC && figureSideB == figureSideE || figureSideA == figureSideB && figureSideC == figureSideE || figureSideA == figureSideE && figureSideB == figureSideC) {
            System.out.println("Прямоугольник");
        } else {
            System.out.println("Разностороння четырех угольник");// без учета трапеции
        }

    }
}
