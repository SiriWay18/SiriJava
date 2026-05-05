package BASICS.Statements;

public class CompoundInterest {

    public double ci(int p , double r , double t){
        double rate =  1 + (r/100);
        double time = Math.pow(rate, t);
        double amount = p * time ;
        return amount - p ;
        // p = principal amount , r = rate of interest in % , t = time
        //CI = amount - principle
    }
}
