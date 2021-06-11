package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main (String[] args) {
        int hourlyRate = 50;
        String reply = ( hourlyRate > 45 ) ? "Accept" : "Reject";
        System.out.println("reply = " + reply);

        String todayClass = "java";
        String teacher = (todayClass.equals("java")) ? "Saim|Murodil" : "Nadir";
        System.out.println("Today's teacher = " + teacher);

        boolean isEligibleToDrive = false;
        String driving = isEligibleToDrive ? "Yes, have DL, can drive" : "No DL, cannot drive";
        System.out.println("driving = " + driving);
    }
}
