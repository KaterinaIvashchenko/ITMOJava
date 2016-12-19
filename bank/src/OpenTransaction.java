
public class OpenTransaction implements Runnable {

    private final Bank service;

    public OpenTransaction(Bank service) {
        this.service = service;
    }

    @Override
    public void run() {

        synchronized (Bank.bankService2) {
            while (true) {
                try {

                    System.out.println("Open an transaction");
                    synchronized (Bank.bankService3) {
                        Bank.bankService3.notify();
                    }
                    Thread.sleep(5000);
                } catch (InterruptedException e) {

                }
            }
        }
    }
}
