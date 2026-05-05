package BASICS.Operators;

public class ArithematicOperators {
    public ArithematicOperators(int a, int b) {
        System.out.println("ArithematicOperators");
        if(b>0) {
            System.out.println("a+b = " + (a + b));
            System.out.println("a-b = " + (a - b));
            System.out.println("a/b = " + a / b);
            System.out.println("a*b = " + a * b);
            System.out.println("a%b = " + a % b);
        }else {
            System.out.println("check b value");
        }
    }


}
