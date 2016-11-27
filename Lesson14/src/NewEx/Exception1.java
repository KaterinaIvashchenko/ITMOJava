package NewEx;

//
public class Exception1 extends Exception {
    private double amount;

    public Exception1(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
