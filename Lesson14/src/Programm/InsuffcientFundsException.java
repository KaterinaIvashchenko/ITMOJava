package Programm;

/**
 * Created by katerina on 11/25/16.
 */

public class InsuffcientFundsException extends Exception {
    private double amount;

    public InsuffcientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
