package lession6;

public class NumbersUtils {
    /**
     * 1 - модифкатор доступа
     * public (доступ везде в проекте)
     * ____________ (доступ внутри текущей папки)
     * protected (доступ внутри фаила и его наследниками)
     * private (достпу внутри текущего класса)
     * 2 - static (либо пишем, либо нет)
     * 3 - возвращаемый тип (или слово Void)
     * 4 -  название метода (всегда с маленькой буквы)
     * 5 - входящие параметры в  (), или просто (___) если их нет
     * 6 - тело выполнения метода
     */

    public static int minNum(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        }
        if (b < a && b < c) {
            return b;
        }
        return c;
    }

    public static String figursScanner (int a, int b, int c, int d) {
        if (a == b && a == c && a == d) {
            return "Квадрат";
        }
        if (a != b && a != c && a != d) {
            return "Разностороння трапеция";
        }
        if (a == c && c == d && a !=c
        ) {
            return "Прямоугольник";
        }
        return "Фигура не найдена";
    }

}

