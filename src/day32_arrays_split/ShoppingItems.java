package day32_arrays_split;

public class ShoppingItems {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        System.out.println("-------FIND THE INDEX OF 'Gloves' in items array-------");
        //use for loop with condition
        for(int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves found at index " + i);
                break; //exit for loop
            }
        }

        System.out.println("-----Set boolean to true if first 'iPad' is found-----");
        boolean iPadExists = false;
        for(String item: items) {
            if(item.equalsIgnoreCase("iPad")) {
                iPadExists = true;
                break;
            }
        }
        System.out.println("iPadExists = " + iPadExists);
        if (iPadExists) {
            System.out.println("We bought the iPad!");
        } else {
            System.out.println("We forgot the iPad! :(");
        }

        System.out.println("-----Print a report of each shopping item-----");
        /**
         * Shoes - $99.99 - #12345
         * .....
         * Iphone 12 case - $39.99 - #12350
         */
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
        }

        System.out.println("-----Look for 'Jacket' in items and print all details-----");
        /*
        Jacket - $150.0 - #12346
         */
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Jacket")) {
                System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
                break; //stop searching after jacket is found
            }
        }


    }
}
