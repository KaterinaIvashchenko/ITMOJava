package simpleMultyThreading;

/**
 * Created by katerina on 12/9/16.
 */

public class SimpleMTh {

    public static void main(String[] args) throws InterruptedException {
        Thread simpleThread = new Simple();
        simpleThread.setName("simpleThread");
        simpleThread.start();
        Thread.sleep(3000);
        simpleThread.isInterrupted();
    }

    public static class Simple extends Thread {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println(Thread.currentThread().getName());

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
