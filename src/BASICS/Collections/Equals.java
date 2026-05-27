package BASICS.Collections;

import java.util.Objects;

class User{
    private int id;
    private String name;
    public User(int id, String name){
        this.id = id;
        this.name = name;
        System.out.println(this.id + " " + this.name);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class Equals {
    public static void main(String[] args) {
        User u1 = new User(1, "a");
        User u2 = new User(1, "a");
        if(u1.equals(u2)){
            System.out.println("u1 equals u2 and compare content ");
        }else {
            System.out.println("u1 not equals u2 and compare content ");
        }
        if(u1 == u2){
            System.out.println("u1 == u2 and compare address ");
        }else{
            System.out.println("u1 != u2 and compare address ");
        }
    }
}
