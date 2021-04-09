package lession10;

// TODO: 19.03.2021

public class Dog extends Animal {

    @Override
    public void voice() {
        System.out.println("гав гав гав");
    }

    @Override
    public String toString() {
        return "Dog: " + this.getAge() + "года";
    }
}
