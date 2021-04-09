package lession2;

public class Main2 {
    public static void main(String[] args) {
        int tour = 40000; // rub
        int salary = 60000; // rub
        int dayTour = 8; // days

        if (dayTour > 7 || tour < salary) {
            System.out.println("Мы поедем в тур");
        } else {
            System.out.println("Мы не поедем в тур");
        }
    }
}
