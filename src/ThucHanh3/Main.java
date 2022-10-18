package ThucHanh3;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        try{
            while (count.getMyThread().isAlive()){
                System.out.println("main thread chuoi van con va tieo tuc chay  ");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread bi gap van de ");
        }
        System.out.println("Main thread chay ket thuc ");
    }
}
