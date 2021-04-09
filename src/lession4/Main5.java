package lession4;

public class Main5 {
    public static void main(String[] args) {
        String email = "sakl1@dfjl.co2345678901m";
        String[] partsMail = email.split("@");
        if (partsMail.length != 2) {
            System.out.println("Не подходит");
            return;
        }
        if (!partsMail[1].contains(".")) {
            System.out.println("Не подходит");
            return;
        }
        if (email.startsWith(".") || email.endsWith(".")) {
            System.out.println("Не подходит");
            return;
        }
        String[] partsPerPoint = email.split("\\.");
        String lastPart = partsPerPoint[partsPerPoint.length - 1];
        if (!lastPart.contains("0-9")) {
            System.out.println("Не подходит");
            return;
        }
    }
}
