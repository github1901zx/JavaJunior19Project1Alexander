package lession15;

import java.util.HashMap;

public class Holodilnik {

    private HashMap<String, Integer> products = new HashMap<>();

    public Holodilnik() {
        // default
    }

    public void addProduct(String nameProduct, int weightProduct) {
        if (products.containsKey(nameProduct)) {
            int currentWeight = products.get(nameProduct);
            products.put(nameProduct, currentWeight + weightProduct);
        } else {
            products.put(nameProduct, weightProduct);
        }
    }

    public void printAllProducts() {
        for (String key : products.keySet()) {
            System.out.println(key + "-" + products.get(key));
        }
    }

    public void getProduct(String nameProduct, int weightProduct) {

        if (!products.containsKey(nameProduct)) {
            System.out.println(" Такого продукта нет ");
            return;
        }
        if (products.get(nameProduct) == weightProduct) {
            products.remove(nameProduct);
            return;
        }
        if (products.get(nameProduct) < weightProduct) {
            System.out.println(" Такого количества нет ");
            return;
        }

        products.put(nameProduct, products.get(nameProduct) - weightProduct);
    }

    public void canCockingDish(Recept nameRecept) {

        boolean canCock = false;

        for (String ingrid : nameRecept.getIngridients().keySet()) {
            if (!products.containsKey(ingrid)) {
                System.out.println(" Нет ингридиента " + ingrid);
                canCock = true;
            }
        }

        if (canCock) {
            return;
        }

        for (String ingrid : nameRecept.getIngridients().keySet()) {
            if (products.get(ingrid) < nameRecept.getIngridients().get(ingrid)) {
                System.out.println(" Не хватает ингридиента " + ingrid + ", требуется больше чем есть");
                canCock = true;
            }

        }

        if (canCock) {
            return;
        }

        System.out.println(" иди готовь ");
    }


}
