package BASICS.Loops;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range ");
        int n = sc.nextInt();
       NumbersFrom1to10 numbersFrom1to10 = new NumbersFrom1to10();
        numbersFrom1to10.number();
        numbersFrom1to10.range(n);
        numbersFrom1to10.dow(n);
        OddOrEvenNumbers oddOrEvenNumbers = new OddOrEvenNumbers();
        oddOrEvenNumbers.odd(n);
        oddOrEvenNumbers.oddw(n);
        oddOrEvenNumbers.oddow(n);
        oddOrEvenNumbers.even(n);
        oddOrEvenNumbers.evenw(n);
        oddOrEvenNumbers.evenow(n);
        Armstrong arm = new Armstrong();
        arm.armstrong(n);
        arm.sumOfDigits(n);
        MultiplicationTable mul = new MultiplicationTable();
        mul.tables(n);
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fib(n);

        /*
      Print Pascal triangle
 Find HCF and LCM of two numbers
Print series: 3 33 333 3333...
 Print Arithmetic Progression
 Print Geometric Progression*/
    }
}
