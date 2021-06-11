package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        //        String carModel;
//        carModel = "BMW x5";
        String carModel = "Jeep Wrangler";
        String driverName = "Batman";
        String licenseNumber = "btm123";
        short speed = 80;
        boolean isAutomatic = false;
        char licenseClass = 'D';

        System.out.println("Car model : "+ carModel);
        //Dodge charger is car model.
        System.out.println(carModel + " is car model.");
        System.out.println("Driver name: " + driverName);
        System.out.println(driverName + " is driving a car");

        //Donald Trump is driving Dodge charger
        System.out.println(driverName+" is driving "+carModel);

        System.out.println("Current speed is: "+speed);
        //Current speed is: 55 mph
        System.out.println("Current speed : " + speed + " mph");

        System.out.println("is car automatic -> " + isAutomatic);
        System.out.println(licenseClass+" - "+isAutomatic);
    }

}
