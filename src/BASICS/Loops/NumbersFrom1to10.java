package BASICS.Loops;

import org.w3c.dom.ls.LSOutput;

public class NumbersFrom1to10 {
    public void number(){
    System.out.println("Numbers from 1 to 10");
    int i = 1;
    while(i<=10){
        System.out.print(i+" ");
        i++;
    }
        System.out.println(" ");
    }

    public void range(int n ){
        int i = 1;
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
        System.out.println(" ");
    }
    public void dow(int n ){
        int i = 1;
        do{
            System.out.print(i+" ");
            i++;
        } while(i<=n);
        System.out.println(" ");
    }

}
