package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {
        ///BREAK STATEMENT: 123
        for(int n = 1; n <= 5; n++) {
            System.out.print(n);
            if(n == 3) {
                break;
            }
        }

        System.out.println();
        //CONTINUE: 135
        for(int i = 1; i <= 5; i++) {
            if(i == 2 || i == 4) {
                continue; //goto next iteration. skip the code below
            }
            System.out.print(i);
        }
    }
}
