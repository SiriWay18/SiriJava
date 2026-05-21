package BASICS.Oops.ExceptionHandling;

public class main {
    static void withdraw(int balance, int amount) throws InsufficientBalanceException {
        if(amount > balance){
            throw new InsufficientBalanceException("Low Balance");
        }
        System.out.println("Withdrawal Success");
    }
    public static void main(String[] args)
    {
        try {
            withdraw(5000,7000);
        }
        catch(InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg)
    {
        super(msg);
    }
}

