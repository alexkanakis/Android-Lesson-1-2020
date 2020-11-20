package gr.uom.android.lesson1;

public class SimpleAccount extends Account {

    private double cost;

    public SimpleAccount(String accountNumber, double balance, double cost) {
        super(accountNumber, balance);
        this.cost = cost;
    }

    @Override
    public double getWithdrawCost(double amount) {
        return cost;
    }
}
