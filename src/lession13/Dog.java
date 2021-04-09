package lession13;

public class Dog implements ZooAnimal{
    @Override
    public void voice() {
        System.out.println("gav gav");
    }

    @Override
    public void jump() {
        System.out.println("Dog class");
    }

    @Override
    public void run() {
        System.out.println("Dog run");
    }
}
