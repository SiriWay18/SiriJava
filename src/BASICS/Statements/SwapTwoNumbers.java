package BASICS.Statements;

public class SwapTwoNumbers {
    public void swap(int a , int b ){
        System.out.println("Before swap : " + a+" "+b);
        a= a+b; //10 + 20
        b= a-b;
        a= a-b;
        System.out.println("After swap : " + a+" "+b);
    }
}
