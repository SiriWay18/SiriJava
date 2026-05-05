package BASICS.Operators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for a : ");
        int a = sc.nextInt();
        System.out.println("Enter the number for b , b > 0  : ");
        int b = sc.nextInt();
        ArithematicOperators  AO= new ArithematicOperators( a , b );
        RelativeOperators RO = new RelativeOperators( a, b);
        LogicalOperators LO = new LogicalOperators(a , b );
        BitwiseOperators BO = new BitwiseOperators( a , b );
        TernaryOperator TO = new TernaryOperator( a , b );

    }
}
