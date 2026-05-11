package BASICS.Oops;

public class CopyConstructor {
    // constructor copying another object
    // ClassName(ClassName obj)
    String name;
    String email;
    public CopyConstructor(String a, String email) {
        name=a;
        this.email=email;
    }
    CopyConstructor(CopyConstructor c) {
        this.name=c.name;
        this.email=c.email;
    }
    public void display(){
        System.out.println(email +" " + name );
    }


    public static void main(String[] args) {
        CopyConstructor cc = new CopyConstructor("Siri","SIRI@gmail.com");
        CopyConstructor co = new CopyConstructor(cc);
        cc.display();
        co.display();
        System.out.println(cc == co);
    }
}
