package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testing, maven, cucumber";
        //first comma
        System.out.println(technologies.indexOf(",")); //4
        //last comma
        System.out.println(technologies.lastIndexOf(","));//40
        //for middle one, we need to loop
        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index " + indexOfJava);

        int idxOfCss = technologies.indexOf("css");
        System.out.println(" css is at index " + idxOfCss);

        int indexOfCucumber = technologies.indexOf("cucumber");

        int indexOfSql = technologies.indexOf("sql"); //not present -1
        System.out.println("sql is at index " + indexOfSql);

        //technologies contais "maven" ?
        if(technologies.contains("maven")) {
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }

        if (technologies.indexOf("maven") > -1) {
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }
    }
}
