package BASICS.Oops;

public class B {
    C c = new C();
    public int f2(){
        System.out.println("inside B.f2");
        return c.f3();
    }
}
