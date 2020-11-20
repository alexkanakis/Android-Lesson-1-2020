package gr.uom.android.lesson1;

public abstract class Account {

    private String accountNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        balance = 0;
    }

    public Account() {
        accountNumber = "abc" + Math.random();
        balance = 0;
    }

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount){

        double cost = getWithdrawCost(amount);
        amount = amount + cost;
        System.out.println(" Withdraw cost = " + cost);
        if(balance >= amount){
            balance -= amount;

        }
        System.out.println("Withdraw of "+ amount +" New balance = " + balance);
    }

    public abstract double getWithdrawCost(double amount);


    @Override
    public String toString() {
        return "Account No." + accountNumber + " Current Balance = " + balance;
    }

    @Override
    public int hashCode() {
        return accountNumber.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj instanceof Account){
            Account other = (Account)obj;
            if(this.hashCode() == obj.hashCode()){
                return true;
            }
        }
        return false;

    }
}