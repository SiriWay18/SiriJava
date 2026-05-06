package BASICS.Functions;

public class CallByValue {
    public void call(int a){
        System.out.println("CallByValue is not going to be stored until will provide variable - "+ a);
        a=18;
        System.out.println("inside method value of a is " + a);
    }
}
