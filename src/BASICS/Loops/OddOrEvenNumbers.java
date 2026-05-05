package BASICS.Loops;

public class OddOrEvenNumbers {
    public void odd(int n){
        for (int i = 0; i <= n; i++) {
            if(i%2 !=0){
                System.out.print(i+" ");
            }}
            System.out.println("odd numbers ");
    }
    public void oddw(int n){
        int i = 0;
        while (i <= n) {
            if(i%2 !=0){
                System.out.print(i+" ");
            }
            i++;}
        System.out.println("odd numbers ");
    }
    public void oddow(int n){
        int i = 0;
        do{
            if(i%2 !=0){
                System.out.print(i+" ");
        } i++;
        }while (i <= n);
        System.out.println("odd numbers ");
    }
    public void even(int n){

        for (int i = 0; i <= n; i++) {
            if(i%2 ==0){
                System.out.print(i+" ");
            }}
        System.out.println("even numbers ");
    }
    public void evenw(int n){
        int i = 0;
        while(i <= n) {
            if(i%2 ==0){
                System.out.print(i+" ");
            }i++;}
        System.out.println("even numbers ");
    }
    public void evenow(int n){
        int i = 0;
        do{ if(i%2 ==0){
            System.out.print(i+" ");
        }i++;} while(i <= n) ;
        System.out.println("even numbers ");
    }
}
