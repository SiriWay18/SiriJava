package BASICS.Functions;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        EvenOrOdd eoo = new EvenOrOdd();
        if(eoo.canEven(n)== true){
            System.out.println(n+ " is a Even");}
        else{
            System.out.println(n+ " is a  Odd");}
        System.out.println("Enter the string");
        String s = sc.next();
        StringToUpperCase st = new StringToUpperCase();
       System.out.println(st.upper(s));
        CallByValue cbv = new CallByValue();
        cbv.call(n);
        int x = cbv.call1(n);
        System.out.println("Call By Value: "+n);
        CallByReference c = new CallByReference();
        c.var = n;
        c.name = s;
        System.out.println("Call By Reference: "+c.name + " " + c.var );
        c.cby(c);
        System.out.println("Call By Reference: "+c.name + " " + c.var ); //  no new object so - input changed(copied)
        c.cby1();
        c.cby2(c);
        c.cby3(); // if we store the return type and print return type reference with variables then we will change the result else input doesnt changed(just stored  , not copied )


    }
}
