/**
 * Создать Банк, в котором есть баланс, имя и ID пользователя. Производятся транзакции, закрываются и открываются счета.
 */

public class Bank {
    boolean request = true;

    static Bank bankService = new Bank();
    static Bank bankService1 = new Bank();
    static Bank bankService2 = new Bank();
    static Bank bankService3 = new Bank();
    static Bank bankService4 = new Bank();
    static final Thread UserID = new Thread(new UserID(bankService));
    static final Thread UserName = new Thread(new UserName(bankService));
    static final Thread UserBalance = new Thread(new UserBalance(bankService));
    static final Thread OpenTransaction = new Thread(new OpenTransaction(bankService));
    static final Thread CloseTransaction = new Thread(new CloseTransaction(bankService));

    public static void main(String[] args) throws InterruptedException {
        UserID.start();
        Thread.sleep(300);

        UserName.start();
        Thread.sleep(300);

        UserBalance.start();
        Thread.sleep(300);

        OpenTransaction.start();
        Thread.sleep(300);

        CloseTransaction.start();
        Thread.sleep(300);
    }
}
