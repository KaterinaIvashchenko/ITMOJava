package Programm;

public class Main {

    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount(101);
        System.out.println("Dep 500");
        c.deposit(500.00);

        try {

            System.out.println("Withdrawing 100...");
            c.withdraw(100.00);
            System.out.println("Withdrawing 600...");
            c.withdraw(600.00);
        } catch (InsuffcientFundsException e) {
            System.out.println("You have not enough of money: " + e.getAmount());
            e.printStackTrace();
        }
    }
}
