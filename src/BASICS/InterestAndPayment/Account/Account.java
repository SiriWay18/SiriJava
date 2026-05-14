package BASICS.InterestAndPayment.Account;

public class Account {
    Long accountNumber;
    String customerName;
     double balance;
     int rate;
     public Account(double balance){
         this.balance = balance;
     }
    public Account(Long accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
        System.out.println("Account number "+accountNumber+" "+customerName+" "+balance);
    }
    public double deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Enter valid amount");
        }
        return balance;
    }
    public double withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient funds");
        }else if (amount < 0){
            System.out.println("enter current amount ");
        }else if (amount <= balance){
            if(amount <= balance){
                balance = balance - amount;
                System.out.println("Withdraw amount done   " + amount);
            }}
        return balance ;
    }
    public double interest( ){
        return balance;
    }
    public void display(){
        System.out.println("Balance: "+balance);
    }
}
