package BASICS.Functions;

public class PrintNosWithoutUsingLoop { //recurssion
    public void printN(int n){
        if(n<=10){
            System.out.println(n);
             printN(n+1);
        }}
    public static void main(String[] args) {
        PrintNosWithoutUsingLoop p = new PrintNosWithoutUsingLoop();
        p.printN(1);
    }
}
