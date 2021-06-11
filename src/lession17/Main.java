package lession17;

public class Main {
    public static void main(String[] args) throws UncurrentAgeException {
        Person person = new Person();
//        try {// Компилятор продолжит выполнять код ниже
//            person.setAge(340);
//            System.out.println(" Успех ");
//        } catch (UncurrentAgeException e) {
//            e.printStackTrace();
//            System.out.println(" Перехватили ");
        person.setAge(340);
        System.out.println(" Успех ");
        System.out.println(" Программа работет ");
    }
}
