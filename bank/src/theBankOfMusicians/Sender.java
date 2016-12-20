package theBankOfMusicians;

import java.util.concurrent.TimeUnit;

public class Sender implements Runnable {

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {

                String mail = Bank.queue.poll(20, TimeUnit.MILLISECONDS);
                if (Bank.finished && mail == null) break;
                if (mail == null) continue;
                System.out.println(mail);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
    }
}
