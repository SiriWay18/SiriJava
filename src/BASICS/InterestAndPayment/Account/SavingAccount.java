package BASICS.InterestAndPayment.Account;

public class SavingAccount extends Account{
    public SavingAccount(Long accountNumber, String customerName, double balance) {
        super(accountNumber, customerName, balance);
        this.rate = 5;
    }
    @Override
    public double interest( ) {
        int days = 30 ;
        balance += (balance*rate*days) / (365*100);
        return balance;
        //Daily closing balance
        //Interest calculated daily
        //Paid every quarter (every 3 months)
    }

}
/*
*         Interest()

     Savings Account        → Normal Interest , limited withdraw
     Current Account        → No Interest , Business account
     Fixed Deposit Account  → High Interest , Lock-in period
     Salary Account         → Special Benefits - Zero Min balance ,salary credited */