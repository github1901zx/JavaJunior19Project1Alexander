package homework.lesson;

public class HomeWorkFractionCalculator {


    public static HomeWorkFraction sumFraction(HomeWorkFraction fr1, HomeWorkFraction fr2) {

        if (fr1.getWholePart() > 0) {/*Проверяем есть ли целая часть и приводи ее в дробь*/
            fr1.setNumerator(((fr1.getWholePart() * fr1.getDenominator()) + fr1.getNumerator()));
        }
        if (fr2.getWholePart() > 0) {
            fr2.setNumerator(((fr2.getWholePart() * fr2.getDenominator()) + fr2.getNumerator()));
        }


        int comNumerator = fr1.getNumerator() * fr2.getDenominator()
                + fr1.getDenominator() * fr2.getNumerator();
        int comDenominator = fr1.getDenominator()* fr2.getDenominator();

        HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator, comDenominator);// Вызываем конструктор, строим дробь

        int whole = comNumerator / comDenominator;//Переменная если дробь неправильная, если правильная то вернет 0
        int wholeUsed = whole * comDenominator;//Вычесляет целую часть, наврное можно сделать %, но  зачем если итак работает

        if (comNumerator == comDenominator) { // если числитель равен занменателю
            resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, 0, 0);
        } else if (comNumerator >= comDenominator) {//если числитель больше знаменателя
            resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, comNumerator - wholeUsed, comDenominator);
        }

        for (int i = 9; i >= 2; i--) {// запускает цикл на сокращение дроби
            if (comNumerator % i == 0 && comDenominator % i == 0) {
                resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, (comNumerator - wholeUsed) / i, comDenominator / i);
                i = 2;// если нашел первый наибольший делитель найден выйдет из цикла
            }
        }
        return resultFr1Fr2;
    }

    public static HomeWorkFraction differenceFraction(HomeWorkFraction fr1, HomeWorkFraction fr2) {

        if (fr1.getWholePart() > 0) {/*Проверяем есть ли целая часть и приводи ее в дробь*/
            fr1.setNumerator(((fr1.getWholePart() * fr1.getDenominator()) + fr1.getNumerator()));
        }
        if (fr2.getWholePart() > 0) {
            fr2.setNumerator(((fr2.getWholePart() * fr2.getDenominator()) + fr2.getNumerator()));
        }


        int comNumerator = fr1.getNumerator() * fr2.getDenominator()
                - fr1.getDenominator() * fr2.getNumerator();
        int comDenominator = fr1.getDenominator()* fr2.getDenominator();



        HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator, comDenominator);// Вызываем конструктор, строим дробь

        int whole = comNumerator / comDenominator;//Переменная если дробь неправильная, если правильная то вернет 0
        int wholeUsed = whole * comDenominator;//Вычесляет целую часть, наврное можно сделать %, но  зачем если итак работает

        if (comNumerator == comDenominator) { // если числитель равен занменателю
            resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, 0, 0);
        } else if (comNumerator >= comDenominator) {//если числитель больше знаменателя
            resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, comNumerator - wholeUsed, comDenominator);
        }

        for (int i = 9; i >= 2; i--) {// запускает цикл на сокращение дроби
            if (comNumerator % i == 0 && comDenominator % i == 0) {
                resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, (comNumerator - wholeUsed) / i, comDenominator / i);
                i = 2;// если нашел первый наибольший делитель найден выйдет из цикла
            }
        }
        return resultFr1Fr2;
    }

    public static HomeWorkFraction multiplicationFraction(HomeWorkFraction fr1, HomeWorkFraction fr2) {

        if (fr1.getWholePart() > 0) {/*Проверяем есть ли целая часть и приводи ее в дробь*/
            fr1.setNumerator(((fr1.getWholePart() * fr1.getDenominator()) + fr1.getNumerator()));
        }
        if (fr2.getWholePart() > 0) {
            fr2.setNumerator(((fr2.getWholePart() * fr2.getDenominator()) + fr2.getNumerator()));
        }/**Такое решение является неправильным т.к. при вызове нескольких методов следующий мотд считает изменёную дроб */


        int comNumerator = fr1.getNumerator() * fr2.getNumerator();
        int comDenominator = fr1.getDenominator()* fr2.getDenominator();



        HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator, comDenominator);// Вызываем конструктор, строим дробь

        int whole = comNumerator / comDenominator;//Переменная если дробь неправильная, если правильная то вернет 0
        int wholeUsed = whole * comDenominator;//Вычесляет целую часть, наврное можно сделать %, но  зачем если итак работает

        if (comNumerator == comDenominator) { // если числитель равен занменателю
            resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, 0, 0);
        } else if (comNumerator >= comDenominator) {//если числитель больше знаменателя
            resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, comNumerator - wholeUsed, comDenominator);
        }

        for (int i = 9; i >= 2; i--) {// запускает цикл на сокращение дроби
            if (comNumerator % i == 0 && comDenominator % i == 0) {
                resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, (comNumerator - wholeUsed) / i, comDenominator / i);
                i = 2;// если нашел первый наибольший делитель найден выйдет из цикла
            }
        }
        return resultFr1Fr2;
    }

    public static HomeWorkFraction divisionFraction(HomeWorkFraction fr1, HomeWorkFraction fr2) {

        if (fr1.getWholePart() > 0) {/*Проверяем есть ли целая часть и приводи ее в дробь*/
            fr1.setNumerator(((fr1.getWholePart() * fr1.getDenominator()) + fr1.getNumerator()));
        }
        if (fr2.getWholePart() > 0) {
            fr2.setNumerator(((fr2.getWholePart() * fr2.getDenominator()) + fr2.getNumerator()));
        }/**Такое решение является неправильным т.к. при вызове нескольких методов следующий мотд считает изменёную дроб */


        int comNumerator = fr1.getNumerator() * fr2.getDenominator();
        int comDenominator = fr1.getDenominator() * fr2.getNumerator();



        HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator, comDenominator);// Вызываем конструктор, строим дробь

        int whole = comNumerator / comDenominator;//Переменная если дробь неправильная, если правильная то вернет 0
        int wholeUsed = whole * comDenominator;//Вычесляет целую часть, наврное можно сделать %, но  зачем если итак работает

        if (comNumerator == comDenominator) { // если числитель равен занменателю
            resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, 0, 0);
        }
        else if (comNumerator >= comDenominator) {//если числитель больше знаменателя
            resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, comNumerator - wholeUsed, comDenominator);
        }

        for (int i = 9; i >= 2; i--) {// запускает цикл на сокращение дроби
            if (comNumerator % i == 0 && comDenominator % i == 0) {
                resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, (comNumerator - wholeUsed) / i, comDenominator / i);
                i = 2;// если нашел первый наибольший делитель найден выйдет из цикла
            }
        }
        return resultFr1Fr2;
    }
}



