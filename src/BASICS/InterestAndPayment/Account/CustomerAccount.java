package BASICS.InterestAndPayment.Account;

public class CustomerAccount {
    long AaddarNumber;
    long AccountNumber;
    String address ;
    String PanNumber;
    String Name ;
    double balance;
    String accountType;
    Account account;

    public CustomerAccount(long aaddarNumber , Long AccountNumber  , String panNumber  , String name  , double balance,String accountType) {
        AaddarNumber = aaddarNumber;
        this.AccountNumber = AccountNumber;
        this.PanNumber = panNumber;
        Name = name;
        this.balance = balance;
        this.accountType = accountType;
        if(accountType.equalsIgnoreCase("FixedDepositAccount")){
            account = new FixedDepositAccount(AccountNumber, name, balance,5);
        }else if(accountType.equalsIgnoreCase("CurrentAccount")){
            account = new CurrentAccount(AccountNumber, name, balance);
        }else if(accountType.equalsIgnoreCase("SavingsAccount")){
            account = new SavingAccount(AccountNumber, name, balance);
        }else{
            account = new Account(AccountNumber, name, balance);
            System.out.println("Invalid Account Type");
        }

        System.out.println("AADDAR NUMBER: " + AaddarNumber + " PAN NUMBER: " + PanNumber + " NAME: " + Name + " BALANCE: " + balance);
    }

    public void createAccount() {
        System.out.println("Account Created");
    }
    public void updateAccount() {
        System.out.println("Account Updated");
    }
    public void deleteAccount() {
        System.out.println("Account Deleted");
    }
    public void viewDetails(){
        System.out.println("Customer Account Details");
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Name: " + Name);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
    public void deposit(double amount){
        account.deposit(amount);
    }
    public void withdraw(double amount){
        account.withdraw(amount);
    }
    public void calculateInterest(){
        account.interest();
    }
    public void checkBalance(){
        account.display();
    }
}

