/**
 * Created by katerina on 12/19/16.
 */
public class UserName implements Runnable {
    private final Bank service;

    public UserName(Bank service) {
        this.service = service;
    }

    @Override
    public void run() {
        synchronized (Bank.bankService1) {
            while (true) {
                try {

                    System.out.println("User name");
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
