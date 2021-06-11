package homework.lesson.additionaltask;

public class Main {
    public static void main(String[] args) {


        Books book1 = new Books("JAVA junior","Oracle","Valera",20);
        Article artcl1 = new Article("Java lang Kotlin","Wiki","Gektor","A modern programming language\n" +
                "that makes developers happier.",1);
        Journal jurnl1 = new Journal("JavaCoder","Leak","Andrey",1);


        jurnl1.addArticles(artcl1);
        book1.printInfoEdition();
        System.out.println("*****************");
        artcl1.printInfoEdition();
        System.out.println("*****************");
        jurnl1.printInfoEdition();
        System.out.println("___________________________");
        jurnl1.printJournal();
    }
}
