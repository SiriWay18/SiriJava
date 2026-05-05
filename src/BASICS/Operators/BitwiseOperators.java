package BASICS.Operators;

public class BitwiseOperators {
    public BitwiseOperators(int a , int b ) {
        System.out.println("a&b - bitwise and - it both numbers are 1 then 1 - " + (a&b) );
        System.out.println("a|b - bitwise or - it any numbers are 1 then 1 - " + (a|b) );
        System.out.println("a^b - bitwise XOR(exclusive OR) - it different numbers then 1(0,1 and 1,0) - " + (a^b) );
        System.out.println("~(a+b) - bitwise and - it both numbers are 1 then 1 - " + (~(a+b)) );
        // ~ ==> ~x = -(x + 1)
        System.out.println("a>>b - bitwise right shift -  " + (a>>b) );
        //divide by 2ⁿ
        System.out.println("a<<b - bitwise Left Shift - " + (a<<b) );
        //multiply by 2ⁿ , Shifts bits to the left

}}
