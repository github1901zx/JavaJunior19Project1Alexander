package lession4;

public class Main3 {
    public static void main(String[] args) {
        char [] symbols = {'e','g','y','e','i','d','w','r'};
        for (int i = 0;i < symbols.length;i++){
            if(symbols[i] == 'e' || symbols[i] == 'y' || symbols[i] == 'e' || symbols[i] == 'i'
                    || symbols[i] == 'a'){
                System.out.println(symbols[i]);
            }
        }
    }
}
