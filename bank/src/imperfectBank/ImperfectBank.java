package imperfectBank;

public class ImperfectBank {
    static String mail;
    static final ImperfectBank IMPERFECT_BANK = new ImperfectBank();

    public static void main(String[] args) throws InterruptedException {
        ImperfectAccount acc1 = new ImperfectAccount(1, "Thom Yorke", 50);
        ImperfectAccount acc2 = new ImperfectAccount(2, "Trent Reznor", 60);
        ImperfectAccount acc3 = new ImperfectAccount(3, "Maynard James Keenan", 40);
        ImperfectAccount acc4 = new ImperfectAccount(4, "Steven Wilson", 100);
        ImperfectAccount acc5 = new ImperfectAccount(5, "Mike Patton", 65);
        ImperfectAccount acc6 = new ImperfectAccount(6, "Frank Zappa", 78);

        new Thread(new ImperfectSender()).start();

        new Thread(() -> transferMoney(acc1, acc2, 10)).start();
        new Thread(() -> transferMoney(acc2, acc1, 10)).start();
        new Thread(() -> transferMoney(acc3, acc4, 50)).start();
        new Thread(() -> transferMoney(acc4, acc1, 45)).start();
        new Thread(() -> transferMoney(acc5, acc6, 100)).start();
        new Thread(() -> transferMoney(acc5, acc6, 100)).start();
    }

    private static synchronized void transferMoney(ImperfectAccount acc1, ImperfectAccount acc2, int amount) {
        if (acc1.getBalance() < amount) {
            synchronized (IMPERFECT_BANK) {
                mail = Thread.currentThread().getName() + " - The balance of the first account is less than the amount requested for transfer of money.";
                IMPERFECT_BANK.notify();
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return;
        } else {
            acc1.setBalance(acc1.getBalance() - amount);
            acc2.setBalance(acc2.getBalance() + amount);
            synchronized (IMPERFECT_BANK) {
                mail = Thread.currentThread().getName() + " - Produced the transfer of funds from account of " + acc1.getName() + " to account " +
                        acc2.getName() + " in the amount of " + amount + "$" +  ". New balance of accounts: " + acc1.getName() + " - " + acc1.getBalance() + "$" +
                        ", " + acc2.getName() + " - " + acc2.getBalance() + "$";
                IMPERFECT_BANK.notify();
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}