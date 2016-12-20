package theBankOfMusicians;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Bank {

    static BlockingQueue<String> queue = new LinkedBlockingQueue<>();
    static boolean finished = false;

    public static void main(String[] args) throws InterruptedException {
        TheAccount theAccountOne = new TheAccount(1, "Thom Yorke", 50);
        TheAccount theAccountTwo = new TheAccount(2, "Trent Reznor", 60);
        TheAccount theAccountThree = new TheAccount(3, "Maynard James Keenan", 40);
        TheAccount theAccountFour = new TheAccount(4, "Steven Wilson", 100);
        TheAccount theAccountFive = new TheAccount(5, "Mike Patton", 65);
        TheAccount theAccountSix = new TheAccount(6, "Frank Zappa", 78);

        new Thread(new Sender()).start();

        new Thread(() -> transferMoney(theAccountOne, theAccountTwo, 10)).start();
        new Thread(() -> transferMoney(theAccountTwo, theAccountOne, 10)).start();
        new Thread(() -> transferMoney(theAccountThree, theAccountFour, 50)).start();
        new Thread(() -> transferMoney(theAccountFour, theAccountOne, 45)).start();
        new Thread(() -> transferMoney(theAccountFive, theAccountSix, 100)).start();
        finished = true;
    }

    private static void transferMoney(TheAccount theAccount1, TheAccount theAccount2, int amount) {
        synchronized (theAccount1.getId() > theAccount2.getId() ? theAccount1 : theAccount2) {
            synchronized (theAccount1.getId() < theAccount2.getId() ? theAccount1 : theAccount2) {
                if (theAccount1.getBalance() < amount) {
                    queue.add(Thread.currentThread().getName() + " - The balance of the first account is less than the amount requested for transfer of money.");
                    return;
                } else {
                    theAccount1.setBalance(theAccount1.getBalance() - amount);
                    theAccount2.setBalance(theAccount2.getBalance() + amount);
                    queue.add(Thread.currentThread().getName() + " - Produced the transfer of funds from account of " + theAccount1.getName() + " to account " +
                            theAccount2.getName() + " in the amount of " + amount + ". New balance of accounts: " + theAccount1.getName() + " - " + theAccount1.getBalance() +
                            ", " + theAccount2.getName() + " - " + theAccount2.getBalance());
                }
            }
        }
    }
}
