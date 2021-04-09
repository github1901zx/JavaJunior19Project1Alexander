package lession8;


public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    /** конструктор всегда пишется здесь между методами и под переменными*/
    public Triangle(){   /** Констрктор по умолчанию*/

    }

    public Triangle(int sideA, int sideB, int sideC){/**Констрктор*/
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }/**Конец конструктора*/ // TODO: 12.03.2021

    public void setSideA(int A) {/**методы нужны если сторона треугольника измениться*/
        this.sideA = A;
    }

    public void setSideB(int B) {
        this.sideB = B;
    }

    public void setSideC(int C) {
        this.sideC = C;
    }

    public int getSideA(){/**гетеры пишутся после сетеров возращают значение*/
        return this.sideA;
    }

    public void printInformTriangl (){/**выводит информацию какой это треугольник*/
        if(sideA == sideB && sideA==sideC){
            System.out.println("Равностороний треугольник");
        } else if(sideA != sideB && sideB!=sideC && sideC != sideA){
            System.out.println("Разностороний треугольник");
        }else{
            System.out.println("Равнобедренный");
        }
    }
}