package day14_multi_branch_if_statements;

public class MultiBranchIfStatements {
    public static void main(String[] args) {
        int day = 1;
        if (day == 1) {
            System.out.println("Monday");
        } else {
            System.out.println("Not Monday");
        }

        if (day == 2) {
            System.out.println("Tuesday");
        }

        if (day == 3) {
            System.out.println("Wednesday");
        }

        System.out.println("================MULTI BRANCH IF STATEMENT==================");


        day = 20;

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else {
            System.out.println("java day");
        }

        System.out.println("Everyday code java");

    }
}
