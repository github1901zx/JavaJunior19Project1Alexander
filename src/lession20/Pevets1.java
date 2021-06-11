package lession20;

public class Pevets1 extends Thread{

    private  boolean needStop = false;
    @Override
    public void run() {
        int count = 0;
        while (!needStop){
            count++;


            for (int i = 0 ; i < 3; i++){
                System.out.println("LA-------------");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Monitors.MICROFON){
                Monitors.MICROFON.notify();
            }

            synchronized (Monitors.MICROFON){
                try {
                    Monitors.MICROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if(count > 3 ){
                needStop = true;
            }
        }
    }
}
