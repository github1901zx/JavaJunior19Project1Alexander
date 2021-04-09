package lession13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();

        ArrayList<ZooAnimal> animals = new ArrayList<>();

        animals.add(dog1);
        animals.add(dog2);
        animals.add(monkey1);
        animals.add(monkey2);

        for(ZooAnimal animal : animals){
            animal.voice();
        }

    }
}
