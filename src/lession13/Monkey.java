package lession13;

public class Monkey implements ZooAnimal {

    @Override
    public void voice() {
        System.out.println("yayayayayaaayyyyyyya");
    }

    @Override
    public void jump() {
        System.out.println("Monkey class");
    }

    @Override
    public void run() {
        System.out.println("Monkey run");
    }

}
