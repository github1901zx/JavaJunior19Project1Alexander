package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Boston";
        //Moscow or Tampa
        if (city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("Not considering - " + city);
        }

        String teacher = "Murodil";
        if(teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("It is a java class with " + teacher);
        } else {
            System.out.println("Soft skill class with " + teacher);
        }

        //1- teacher Saim or Murodil -> It is a java class
        //2- teacher Nadir -> Soft skill class
        //any other teacher -> Some class with Gurhan/Akbar
        teacher = "Murodil";
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("java class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skill class with " + teacher);
        } else {
            System.out.println("Some other class with " + teacher);
        }

        //company - "Google" OR salary >= 100k -> accept offer
        String company = "Google";
        double salary = 85_000.0;

        if(company.equals("Google") || salary >= 100_000) {
            System.out.println("Accepting offer from " + company);
        } else {
            System.out.println("Rejecting offer from company " + company);
        }

    }
}
