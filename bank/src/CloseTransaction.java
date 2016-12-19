

public class CloseTransaction implements Runnable {

    private final Bank service;

    public CloseTransaction(Bank service) {
        this.service = service;
    }

    @Override
    public void run() {

        synchronized (Bank.bankService3) {
            while (true) {
                try {

                    System.out.println("Open an transaction");
                    synchronized (Bank.bankService4) {
                        Bank.bankService4.notify();
                    }
                    Thread.sleep(5000);
                } catch (InterruptedException e) {

                }
            }
        }
    }
}
