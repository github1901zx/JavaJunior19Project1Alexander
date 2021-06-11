package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args){
        int toyotas = 431;
        int hondas = 233;
        int vws = 2;
        int teslas = 20;
        int nissans = 1;
        int bmw = 155;

        int totalCarsInParking = toyotas + hondas + vws + teslas + nissans + bmw;
        System.out.println("There are " + totalCarsInParking + " cars in parking lot");

        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices / people;
        // there are 2 slices per person
        System.out.println("There are " + slicesPerPerson + " slices per person");
        //We ordered hawaiian pizza with 8 slices, 4 person ate 2 slices each.
        System.out.println("We ordered " + pizza + " pizza with " + slices + " slices, " + people + " people ate " + slicesPerPerson + " slices each." );
    }
}
