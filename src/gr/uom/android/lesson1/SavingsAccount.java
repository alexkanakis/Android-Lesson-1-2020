package gr.uom.android.lesson1;

public class SavingsAccount extends  Account{

    private double chargingThreshhold;


    public SavingsAccount(String accountNumber, double balance, double chargingThreshhold) {
        super(accountNumber, balance);
        this.chargingThreshhold = chargingThreshhold;
    }

    @Override
    public double getWithdrawCost(double amount) {
        if(getBalance()> chargingThreshhold){
            return 0.1;
        }else{
            return amount*0.047;
        }
    }
}
