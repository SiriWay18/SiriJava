package BASICS.Oops;

import java.sql.SQLOutput;

public class InheritanceMain {
    public static void main(String[] args) {
        InheritanceP inheritanceP = new InheritanceC();
        inheritanceP.abc();
        inheritanceP.show();
        inheritanceP.display(); //InheritanceP.display();
        System.out.println(inheritanceP.num);
        System.out.println("********************");
        InheritanceC inheritanceC = new InheritanceC();
        inheritanceC.abc();
        inheritanceC.show();
        inheritanceC.display(); //InheritanceC.display()
        System.out.println(inheritanceC.num);
        System.out.println("********************");
        InheritanceP parent = new InheritanceC();
        parent.abc();
        parent.show();
        InheritanceP.display(); //parent.display();
        System.out.println(parent.num);
    }
}
