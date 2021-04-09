package lession10;

import java.awt.desktop.ScreenSleepEvent;

public class Main {
    public static void main(String[] args) {
        Dog lidog = new Dog();
        lidog.setAge(2);

        Dog dogSergey = new Dog();
        lidog.setAge(2);

        System.out.println(lidog.equals(dogSergey));
        System.out.println(lidog.toString());
        System.out.println(dogSergey.toString());

    }
}
