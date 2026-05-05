package BASICS.Statements;

public class SmallestOfThreeNumbers {
    public void small(int p , int r , int t ) {
        if(p<r &&  p<t ){
            System.out.println("Smallest number between " + p + " and " + r + " and " + t + " is : " + p );
        }else if (r<t){
            System.out.println("Smallest number between " + p + " and " + r + " and " + t + " is : " + r );
        }else{
            System.out.println("Smallest number between " + p + " and " + r + " and " + t + " is : " + t );
        }
//        double st = (p<r &&  p<t ) ? p : ((r<t) ? r : t ) ;
//        System.out.println("smallest is: " + st);
    }
}
