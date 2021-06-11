package day04_variables_intro;

public class VariableNamingRules {
    public static void main(String[] args) {
        // System.out.println("BREAK TILL 4:10 PM EST");
        //int static = 22; -> error, static is reserved by java
        int static2 = 22;
        int _static = 22;
        int $tatic = 44;
        int staticVar = 234;

        int salary$ = 55;
        //int 1stMonthSalary = 3000; -> error, cannot start with number
        int $ = 10;
        int s = 3;
        System.out.println($);
        System.out.println(s);
        //Above variables work fine, but not recommended.
        //we should use meaningful variable names
        //int number-of-friends = 400; -> ERROR
        int numberOfFriends = 401;
        int number_of_friends = 401; //not convention

        //int 1stNum = 10; CANNOT START with number
        int num1 = 10; // works fine

    }
}
