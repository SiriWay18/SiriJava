package BASICS.InterestAndPayment;

import BASICS.InterestAndPayment.Account.Account;
import BASICS.InterestAndPayment.Account.CurrentAccount;
import BASICS.InterestAndPayment.Account.FixedDepositAccount;
import BASICS.InterestAndPayment.Account.SavingAccount;
import BASICS.InterestAndPayment.Account.CustomerAccount;
import BASICS.InterestAndPayment.Payment.UPIPayment;

// Financial Interest and Payment Management System
public class Main {
    public static void main(String[] args){
//        Account account = new SavingAccount(1001093L,"John",100000.00);
//        Account account = new CurrentAccount(12345L , "John" , 1600043 );
  /*        Account account = new FixedDepositAccount(1234567L , "John",1230976,4);
        account.deposit(10000);
        account.withdraw(5000);
        account.interest();
        account.display();
        UPIPayment upiPayment = new UPIPayment(12345 , 25000 );
        upiPayment.process(3000);*/
        CustomerAccount customerAccount = new CustomerAccount(6705678934L,123456789L,"BAP0986B","AMMA",1000000,"SavingsAccount");
        customerAccount.deposit(5000);
        customerAccount.withdraw(1500);
        customerAccount.checkBalance();
    }
}
