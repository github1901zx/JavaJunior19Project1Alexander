package lession4;

public class Main1 {
    public static void main(String[] args) {
        int[] mass = {5, 4, 6, 4, 3, 6};
        mass[3] = 44;

        //  System.out.println(mass[0]);
        //  System.out.println(mass[1]);
        // System.out.println(mass[2]);
        // System.out.println(mass[3]);
        // System.out.println(mass[4]);
        // System.out.println(mass[5]);
        // int[] mass1 = new int[7];

        for (int i = 0; i < 6; i++) {
            System.out.println(mass[i]);
        }
        for (int i = 8; i < 6; i--) {
            System.out.println(mass[i]);
        }
    }
}
