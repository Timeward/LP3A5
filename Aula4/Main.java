package Aula4;

public class Main {

    public static void main(String[] args) {
        Thread thr1 = new Thread(new Msg("ping"))
        Thread thr2 = new Thread(new Msg("pong"))

        thr1.start();
        thr2.start();
        thr2.interrupt();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {};
        thr1.interrupt();
    }
    
}
