package practic.multithreading;

public class Thread1 extends Thread{
    private boolean aBoolean = true;
    @Override
    public void run() {
        int count = 0;
        while (aBoolean){
            System.out.println("Hi, i am Thread 1");
            count++;
            try{
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
            if(count == 5){
                aBoolean = false;
                System.out.println("I am finish");
            }

        }
    }
}
