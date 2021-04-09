package lession5;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {

        for(int day = 0 ;day < 366;day++){
            for(int hour = 0; hour < 24;hour++){
                for(int min = 0; min < 60; min++){
                    for(int sec = 0; sec < 60; sec++){
                        System.out.printf("Прошло: %d дня, %d часа, %d минут,%d секунд \n"
                                , day, hour, min, sec );
                        Thread.sleep(1000);
                    }
                }
            }
        }
    }
}
