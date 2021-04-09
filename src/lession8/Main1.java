package lession8;

public class Main1 {
    public static void main(String[] args) {
        Triangle andrye = new Triangle(3,2,3);
        Triangle dima = new Triangle(6,6,6);
        Triangle vlad = new Triangle(1,2,3);

        andrye.setSideA(3);/** вводим через метод*/
        andrye.setSideB(2);
        andrye.setSideC(3);

        dima.setSideA(4);
        dima.setSideB(6);
        dima.setSideC(8);

        vlad.setSideA(9);
        vlad.setSideB(9);
        vlad.setSideC(9);

        vlad.printInformTriangl();
        dima.printInformTriangl();
        andrye.printInformTriangl();

        System.out.println(vlad.getSideA()); /**Вернет значение стороны*/


    }


}
