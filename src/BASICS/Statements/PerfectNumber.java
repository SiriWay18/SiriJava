package BASICS.Statements;

public class PerfectNumber {
    public void perfect(int a ){
        int j = 0 ;
        for (int i = 1; i < a; i++) {
            if(a%i==0){
                j += i ;
                System.out.print(i+" ");
            }
        }
        System.out.println(" ");
        System.out.print(j);
        System.out.println(" ");
        if(j==a){
            System.out.println( a + " is perfect number ");
        }else {
            System.out.println(a + " is not a perfect number ");
        }
    }
}
