package day37_methods_overloading;

public class WarmUpMethod {

    public static void main(String[] args) {
        loginVoid("Cybertekstudent", "abc123"); // POSITIVE TEST / SUNNY DAY
        loginVoid("cybertek", "answer"); // NEGATIVE TEST / RAINY DAY
        loginVoid("", "");
        System.out.println(login("cybertekStudent", "abc123"));

        if(login("cybertekStudent", "abc123")){
            System.out.println("login successful, welcome to Canvas");
        }else{
            System.out.println("Login failed");
        }

        boolean isLoginSuccess = login("nadir", "mountain");
        System.out.println("isLoginsSuccess = " + isLoginSuccess);

        if (login("nadir", "mountain")){
            System.out.println("Welcome to Canvas, select course or calendar");
        }else{
            System.out.println("Something wrong with credentials");
        }

    }

    public static void loginVoid(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
            System.out.println("Login successful, welcome Cybertek Student!");
        } else {
            System.out.println("Incorrect username or password");
        }


    }

    public static boolean login(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        //return (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)

        if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
            return true; //return true and exit method, return false will not run
        }
        return false;


    }
}
