
package imperfectBank;

public class ImperfectSender implements Runnable {

     @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                synchronized (ImperfectBank.IMPERFECT_BANK) {
                    while (true) {
                        ImperfectBank.IMPERFECT_BANK.wait();
                        System.out.println(ImperfectBank.mail);
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
    }
}
