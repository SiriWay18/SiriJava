package BASICS.Oops;

public class A {
    B b = new B();
    public int f1(){
        System.out.println("inside A.f1");
        return b.f2();
    }
}
