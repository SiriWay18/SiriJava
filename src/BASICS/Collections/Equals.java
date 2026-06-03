package BASICS.Collections;

import java.util.*;

class User{
    private int id;
    private String name;
    public User(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return id == user.id && Objects.equals(name, user.name);
        return id == ((User)o).id;
    }

    @Override
    public int hashCode() {
        // return Objects.hash(id, name);
        return this.id;

    }

    @Override
    public String toString() {
        //toString is normally used to store the address of an object.
        return "User{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
public class Equals {
    public static void main(String[] args) {
        User Sireesha = new User(1, "Sireesha");
        User Siri = new User(1, "Siri");
        if(Sireesha.equals(Siri)){
            System.out.println("u1 equals u2 and compare content ");
        }else {
            System.out.println("u1 not equals u2 and compare content ");
        }
        if(Sireesha == Siri){
            System.out.println("u1 == u2 and compare address ");
        }else{
            System.out.println("u1 != u2 and compare address ");
        }

        System.out.println(Sireesha); // toString
        System.out.println(Siri); // toString
        Set<User> userSet = new HashSet<>();
        userSet.add(Sireesha);
        userSet.add(Siri);
        System.out.println("Size of set is " + userSet.size());
        System.out.println(userSet);

        Map<User , Integer> userMap = new HashMap<>();
        userMap.put(Sireesha,1);
        userMap.put(Siri,2);
        System.out.println("Size of userMap is " + userMap.size());
        System.out.println(userMap);
    }
}
