/**
 * Created by katerina on 12/19/16.
 */
public class UserID implements Runnable {
    private final Bank service;

    public UserID(Bank service) {
        this.service = service;
    }

    @Override
    public void run() {
        synchronized (Bank.bankService) {
            while (true) {
                try {

                    System.out.println("ID of user");
                    synchronized (Bank.bankService1) {
                        Bank.bankService1.notify();
                    }
                    Thread.sleep(5000);
                } catch (InterruptedException e) {

                }
            }


        }

    }
}
