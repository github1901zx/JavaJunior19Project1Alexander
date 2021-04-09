package homework.lesson;

public class HomeWorkLession2Task2 {
    public static void main(String[] args) {
        int numA = 1;
        int numB = 4;
        int numC = 3;
        int numE = 4;
        int numW = 9;

        if (numA <= numB && numA <= numC && numA <= numE && numA <= numW){
            System.out.println(numA);
        }else if (numB <= numA && numB <= numC && numB <= numE && numB <= numW){
            System.out.println(numB);
        }else if (numC <= numA && numC <= numB && numC <= numE && numC <= numW){
            System.out.println(numC);
        }else if (numE <= numA && numE <= numB && numE <= numC && numE <= numW){
            System.out.println(numC);
        }else {
            System.out.println(numW);
        }
    }
}
