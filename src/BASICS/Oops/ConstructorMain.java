package BASICS.Oops;

import java.util.Scanner;

public class ConstructorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st integer: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd integer: ");
        int b = sc.nextInt();
//        ConstructorParent c= new ConstructorParent();
//       ConstructorParent d = new ConstructorParent(a);
        ConstructorParent e = new ConstructorParent(a,b);
//        ConstructorChild f = new ConstructorChild();
//        ConstructorChild f = new ConstructorChild(a,b);
//        ConstructorChild h = new ConstructorChild("Siri",75000);
        ConstructorChild g = new ConstructorChild(e);


    }
}
