package BASICS.Oops;

public class ConstructorChild extends ConstructorParent {
   String name ;
    int age;
    int weight;
    double salary;
    /* public ConstructorChild() {
         super(10,20);
        System.out.println("ConstructorChild without parameters");
    }
      public ConstructorChild(int age,int weight) {
       super(age);
          this.age=age;
          this.weight=weight;
       System.out.println("ConstructorChild with parameters  - " + age + " has weight = " + weight);
   }
         public ConstructorChild(String name,double salary) {
          super((int) salary);
//          super(Integer.parseInt(name)); // error string != number
          this.name=name;
          this.salary=salary;
          System.out.println("ConstructorChild with parameters  - " + name + " has salary = " + salary);
      }*/
       public ConstructorChild(ConstructorParent cp) {
         this.age = cp.a;
         this.weight = cp.b;
          System.out.println("ConstructorChild with other class/object  age = a , weight = b  - "+ age +" "+ weight );

      }




}
