package lession4;

public class Main2 {
    public static void main(String[] args) {
        int mass [] = new int[15];
        int value = 5;
        for(int i = 0; i < 15;i++){
//            mass[0]=5;
//            mass[1]=10;
//            mass[2]=15;
//
//            mass[14]=55;

            mass [i]= value;
            value = value + 5;
            System.out.println(mass[i]);
        }
    }
}
