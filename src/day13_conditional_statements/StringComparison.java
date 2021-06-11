package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles";
        if (city.equals("Los Angeles")) {
            System.out.println("It is LA");
        } else {
            System.out.println("It is NOT LA");
        }

        String weather = "sunny";
        if (weather.equals("sunny")) {
            System.out.println("Lets go out and code java!");
        } else {
            System.out.println("Lets stay indoors, and code java!");
        }
    }
}
