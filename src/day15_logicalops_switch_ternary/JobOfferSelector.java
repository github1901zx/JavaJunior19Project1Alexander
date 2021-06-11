package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Los Angeles";
        double salary = 120_000.0;
        boolean isRemote = true;
        boolean hasBenefits = false;

        if (location.equals("Los Angeles") && salary >= 120_000.0 && isRemote && hasBenefits) {
            System.out.println("Sure, I will accept this offer");
        } else {
            System.out.println("Lets consider another offer or negotiate ");
        }
    }
}
