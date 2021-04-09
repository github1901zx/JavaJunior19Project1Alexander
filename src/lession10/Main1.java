package lession10;

public class Main1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        Animal[] animals = new Animal[6];

        animals[0] = cat1;
        animals[1] = cat2;
        animals[2] = cat3;
        animals[3] = dog1;
        animals[4] = dog2;
        animals[5] = dog3;

        for ( Animal animal : animals ){
            animal.voice(); // проявление полимарфизма  !!!!!!!!!
        }


    }
}
