package BASICS.Java8F.Streams;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

interface interf{
    public static void m1(){
        System.out.println("Interface static method ");
    }}

public class main {
    public static void main(String[] args) {
        interf.m1();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        System.out.println(list);
        List<Integer> list2 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(list2);
        List<Integer> list3 = list.stream().map(i -> i + 12).collect(Collectors.toList());
        System.out.println(list3);
        long list4 = list.stream().filter(i -> i>10).count();
        System.out.println(list4);
        List<Integer> list5 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list5);
        List<Integer> list6 = list.stream().sorted((i1,i2) ->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
        System.out.println(list6);
    }



}

