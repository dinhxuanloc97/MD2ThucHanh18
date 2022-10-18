package ThucHanh3;

public class Count implements Runnable{
     private Thread myThread;

     public Count(){
         myThread = new Thread(this, "my runnable thread");
         System.out.println("my thread created " + myThread);
         myThread.start();
     }
     public Thread getMyThread(){
         return myThread;
     }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("In ra so  "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("chuoi chay bi ran doan ");
        }
        System.out.println("chuoi chay ke thuc ");
    }
}
