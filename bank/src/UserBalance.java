/**
 * Created by katerina on 12/19/16.
 */
public class UserBalance implements Runnable {
    private final Bank service;

    public UserBalance(Bank service) {
        this.service = service;
    }

    @Override
    public void run() {
        synchronized (Bank.bankService2) {
            while (true) {
                try {

                    System.out.println("User balance");
                    synchronized (Bank.bankService2) {
                        Bank.bankService2.notify();
                    }
                    Thread.sleep(5000);
                } catch (InterruptedException e) {

                }
            }


        }
    }
}
