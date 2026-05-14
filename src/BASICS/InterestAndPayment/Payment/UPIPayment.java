package BASICS.InterestAndPayment.Payment;

import BASICS.InterestAndPayment.Account.Account;

public class UPIPayment extends Payment{

    public UPIPayment(int paymentId, double balance) {
        super(paymentId, balance);

    }

    @Override
    public void process(double amount) {
        account.withdraw(amount);
        System.out.println("Payment Successfully");
        System.out.println("paid "+ amount + " paymentId " + paymentId);
        System.out.println("balance " + balance);
    }
}
