package BASICS.Collections.FunctionalInterfaces;

import java.util.function.BiFunction;

public class Example1 {
    public static int add(int a , int b ){
        return a+b;
    }

   public static void main(String[] args) {
        int sum = add(10,20);
        System.out.println(sum);

       BiFunction<Integer, Integer, Integer>  fun = (a,b)->a+b;
       int res = fun.apply(10,20);
       System.out.println("result in lambda" + res);

       BiFunction<Integer, Integer, Integer>  fun2 = Example1::add;
       int res2 = fun2.apply(10,20);
       System.out.println(res2);
       System.out.println(fun +" "+ fun2);
    }

}
