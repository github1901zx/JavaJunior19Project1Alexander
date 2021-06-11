package day15_logicalops_switch_ternary;

public class NotLogicalOperators {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 20;
        //check if age IS NOT more than 7. print "Need to sit in child car seat. age

        if(!(age > 7)) {
            System.out.println("Need to sit in child car seat. age = " + age);
        } else {
            System.out.println("Can sit normal seat. age = " + age);
        }

        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here. Exit");
        }

        boolean isAffordable = true;

        //if its NOT affordable then print "Item not affordable"

        String carModel = "Tesla";
        if(!carModel.equals("Tesla")) {
            System.out.println("Not interested, thank you");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";
        //if inputPassword is not equals inputPassword : print "Incorrect Password"
        if (!inputPassword.equals("abc123")) {
            System.out.println("Incorrect password");
        }

        if (!inputPassword.equals(secretPassword)) {
            System.out.println("Incorrect password");
        }

        if (inputPassword.equals("abc123")) {
            System.out.println("Correct password");
        } else {
            System.out.println("Incorrect password");
        }
    }
}
