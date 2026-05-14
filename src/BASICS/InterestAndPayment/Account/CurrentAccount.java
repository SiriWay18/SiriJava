package BASICS.InterestAndPayment.Account;

public class CurrentAccount extends Account {
    public CurrentAccount(Long accountNumber, String customerName, double balance) {
        super(accountNumber, customerName, balance);
    }
    @Override
    public double interest( ) {
        System.out.println("no interest in CurrentAccount");
        return balance;
        //Daily closing balance
        //Interest calculated daily
        //Paid every quarter (every 3 months)
    }

}
