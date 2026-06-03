package BASICS.Collections.FunctionalInterfaces;

public class CustomerDetails {
    int id;
    String name;
    int age;
    double payment;
    String items;
    double discount ;
    public CustomerDetails(int id, String name){
        this.id = id;
        this.name = name;
    }
    public CustomerDetails(int id, String name, int age, double payment, String items, double discount) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.payment = payment;
        this.items = items;
        this.discount = discount;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + payment + " " + items + " " + discount;
    }
}

class Student {
    String name;
    int marks;
    String grade;
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
