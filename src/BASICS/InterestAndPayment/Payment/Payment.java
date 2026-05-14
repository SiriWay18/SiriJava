package BASICS.InterestAndPayment.Payment;

import BASICS.InterestAndPayment.Account.Account;

abstract class Payment {
    int paymentId;
    double balance;
    Account account;
    public Payment(int paymentId, double balance) {
        this.paymentId = paymentId;
        this.balance = balance;
        account = new Account(balance);
    }
   abstract public void process( double amount );
}
/*       UPI Payment           → UPI ID based
        Credit Card Payment   → Credit Limit Check
        Debit Card Payment    → Direct Bank Deduction
        Net Banking Payment   → Bank Authentication*/
