package BASICS.Oops;

public class ConstructorParent {
int a,b;
    public ConstructorParent() {

        System.out.println("ConstructorParent without parameters");

    }
    public ConstructorParent(int a ) {

        System.out.println("Primitive one parameter ConstructorParent - " + a);
    }
    public ConstructorParent(int a , int b ) {
        this.a=a;
        this.b=b;
        System.out.println("Primitive two parameter ConstructorParent - "+ a + " "+ b);
    }

}
