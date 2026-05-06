package BASICS.Functions;

import java.util.Scanner;

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

    }
}
