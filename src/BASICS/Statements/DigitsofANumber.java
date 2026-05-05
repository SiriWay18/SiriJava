package BASICS.Statements;

public class DigitsofANumber {
    public void digits(long a){
        if (a>0){
            int i = 0;
            while(i<a){
             long b  = a%10;
             a=a/10;
             System.out.println(b);
             i++;
        }}
        System.out.println(a);
    }
  /*  public static void main(String[] args) {
        int a = 1234;
        for (int i = 1; i <= a; i++) {
            long b = a % 10;
            a = a / 10;
            System.out.println(b);
        }
        System.out.println(a);
    } */

}
