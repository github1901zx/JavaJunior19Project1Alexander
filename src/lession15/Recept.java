package lession15;

import java.util.HashMap;

public class Recept {

    HashMap<String, Integer> ingridients = new HashMap<>();

    private String name;
    private int cockingTime;

    public Recept() {
        // default
    }

    public Recept(String name, int cockingTime) {
        this.name = name;
        this.cockingTime = cockingTime;
    }

    public void addIngridient(String nameProduct, int weightProduct) {
        if (ingridients.containsKey(nameProduct)) {
            int currentWeight = ingridients.get(nameProduct);
            ingridients.put(nameProduct, currentWeight + weightProduct);
        } else {
            ingridients.put(nameProduct, weightProduct);
        }
    }

    public void printAllIngridient() {
        for (String key : ingridients.keySet()) {
            System.out.println(key + "-" + ingridients.get(key));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCockingTime() {
        return cockingTime;
    }

    public void setCockingTime(int cockingTime) {
        this.cockingTime = cockingTime;
    }


    public HashMap<String, Integer> getIngridients() {
        return ingridients;
    }

    public void setIngridients(HashMap<String, Integer> ingridients) {
        this.ingridients = ingridients;
    }
}
