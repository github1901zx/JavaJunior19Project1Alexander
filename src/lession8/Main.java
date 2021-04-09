package lession8;

// TODO: 12.03.2021
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.setName("Misha");
        dog2.setName("Sergey");

        dog1.setAge(14);
        dog2.setAge(28);

        dog1.setBreed("Alabay");
        dog2.setBreed("Pydel");

        dog1.printAbout();
    }
}
