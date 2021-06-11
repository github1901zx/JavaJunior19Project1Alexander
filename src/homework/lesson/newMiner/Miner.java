package homework.lesson.newMiner;

import java.util.concurrent.ThreadLocalRandom;

public class Miner {


    private int[][] conva = new int[4][4];
    private boolean[][] boolConva = new boolean[4][4];

    public void addMins() {
        int countMin = 0;
        for (int i = 0; i < conva.length; i++) {
            for (int j = 0; j < conva[i].length; j++) {
                conva[ThreadLocalRandom.current().nextInt(0, 4)]
                        [ThreadLocalRandom.current().nextInt(0, 4)]
                        = -1;
                conva[0][0]=-1;
                boolConva[i][j] = false;
            }
            countMin++;
            if (countMin < 3) {
                break;
            }
        }
    }

    public void lookConva() {
        for (int i = 0; i < conva.length; i++) {
            for (int j = 0; j < conva[i].length; j++) {
                System.out.print(conva[i][j] + " ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < boolConva.length; i++) {
            for (int j = 0; j < boolConva[i].length; j++) {
                System.out.print(boolConva[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public void openCall(int x, int y) {

        if (conva[x][y] == -1 && boolConva[x][y] == false) {
            System.out.println("--Вы подорвались--");
            boolConva[x][y] = true;
            return;
        } else {
            boolConva[x][y] = true;
            System.out.println("--Продолжайте--");
        }
    }

    public void counMine (){
        if(conva[0][0] == -1){
            if(conva[0][1] != -1){
                conva[0][1]++;
            }
            if(conva[1][0] != -1){
                conva[1][0]++;
            }
            if(conva[1][1] != -1){
                conva[1][1]++;
            }

        }
    }
}





