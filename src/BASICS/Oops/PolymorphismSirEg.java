package BASICS.Oops;

public class PolymorphismSirEg {
    public static void main(String[] args) {
        // 1st way
       /* Human human = new Human(); //static way
        human.greet("Siri");
        Human male = new Male();
        male.greet("Sirish");
        Human female = new Female();
        female.greet("Sireesha");*/

        /* // statergy pattern - 2nd way
        Human h = null ;
        String gender = "Female" ;

        if(gender.equals("Female")){
            h = new Female();   //Dynamic way
        }else if(gender.equals("Male")){
            h = new Male();
        }else {
            System.out.println("Invalid Gender");
        }
        h.greet("Sireesha"); */

        // 3rd way
        Human h = null ;
        String gender = "Female" ;
        //custom type return
        h = Human.getHuman(gender);
        h.greet("Sireesha");
    }
}
//2nd way
/*interface Human{
    void greet(String name);
}
class Male  implements Human {
    public void greet(String name){
        System.out.println("Hello man "+name);
    }
}
class Female  implements Human{
    public void greet(String name){
        System.out.println("Hello female "+name);
    }
} */

//1st way
class Human {
    public void greet(String name){
        System.out.println("Hello "+name);
    }
    //3rd way
    public static Human getHuman(String g){
        if(g.equals("Female")){
            return new Female();   //Dynamic way
        }else if(g.equals("Male")){
            return new Male();
        }
        return new Human();
    }
}
 class Male  extends Human {
    public void greet(String name){
        System.out.println("Hello man "+name);
    }
 }
 class Female  extends Human {
    public void greet(String name){
        System.out.println("Hello female "+name);
    }
 }
