package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "snowy";

        if (weather.equals("sunny")) {
            System.out.println(weather + " - Go to park, hiking, and code java!");
        } else if (weather.equals("rainy")) {
            System.out.println(weather + " - Stay home, drink some green tea, and code java.");
        } else if (weather.equals("snowy")) {
            System.out.println(weather + " - Clean the car then build snowman, drink hot chocolate, and code java");
        } else if (weather.equals("windy")) {
            System.out.println(weather + " - Get ready for power loss, fly a kite, and code java ");
        } else {
            System.out.println(weather + " - Just keep coding java");
        }
    }
}
