package BASICS.Statements;

public class DivisibleBy3Or7 {
    public void divisible(int a){
       if(a%3==0 || a%7==0){
            System.out.println(a + "  is a divisible of either nor  3 or 7");
        }else{
            System.out.println(a + "  is not  a divisible of both 3 or 7 ");
        }
    }
}
