package BASICS.Statements;

public class DivisibleBy2And3 {
    public void divisible(int a){
        if(a%2==0 && a%3==0){
            System.out.println(a + "  is a divisible of both 2 and 3");
        }else {
            System.out.println(a + "  is not  a divisible of both 2 and 3");
        }
    }
}
