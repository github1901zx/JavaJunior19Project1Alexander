package lession15;

public class Main {
    public static void main(String[] args) {
        Holodilnik vlad = new Holodilnik();

        vlad.addProduct("Sliva",5);
        vlad.addProduct("Sliva",2);
        vlad.addProduct("Appale",10);
        vlad.addProduct("Meat",1);
        vlad.addProduct("Grusha",5);

        vlad.printAllProducts();
        vlad.getProduct("Appale",10);
        System.out.println("---___---___---___---___---___---___---");
        vlad.printAllProducts();
        System.out.println("---___---___---___---___---___---___---");

        Recept receptBorsh = new Recept("borsh",20);

        receptBorsh.addIngridient("Meat",2);
        receptBorsh.addIngridient("Grusha",6);
        receptBorsh.addIngridient("Sliva",2);
        receptBorsh.addIngridient("Limon",2);

        receptBorsh.printAllIngridient();



        vlad.canCockingDish(receptBorsh);

    }
}
