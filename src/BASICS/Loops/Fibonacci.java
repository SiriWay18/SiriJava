package BASICS.Loops;

public class Fibonacci {
    public void  fib(int a){
        int  n =0;
        int n1 = 1 ;
        for(int i=1;i<=a;i++){
            System.out.print(n+" ");
            int n2 = n+n1;
            n=n1;
            n1=n2;
        }

    }
}
