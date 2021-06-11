package day05_primitives_concatenation;

public class CellPhone {
    public static void main(String[] args){
        String brand = "Apple";
        String model = "Iphone 12";
        String colour = "Blue";
        double price = 250.0;
        int storage = 128;
        boolean hasCamera = true;

        System.out.println(brand);
        System.out.println(model);
        //WITH MESSAGE
        System.out.println("Brand is " + brand);
        System.out.println("Model is " + model);
        System.out.println("Colour is " +colour);
        System.out.println("Price is $" + price);
        System.out.println("Storage is " + storage + "GB");
        System.out.println("Has camera? - " + hasCamera);
    }
}
