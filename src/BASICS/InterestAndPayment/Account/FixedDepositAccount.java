package BASICS.InterestAndPayment.Account;

public class FixedDepositAccount  extends Account {
    int years  ;
    public FixedDepositAccount( Long accountNumber, String customerName, double balance , int years)  {
        super(accountNumber, customerName, balance);
        this.years = years;
        this.rate = 7;
    }

    @Override
    public double interest() {
        balance += (balance*rate*years) / 100;
        return balance;
    }
}
