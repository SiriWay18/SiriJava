package BASICS.Oops;

 class Address{
    String add;
     public Address(String add) {
         this.add = add;
     }
 }

public class ShallowDeepCopyConstructor {
     int number ;
     Address address;

    public ShallowDeepCopyConstructor(int number, Address address) {
        this.number = number;
        this.address = address;
    }
    ShallowDeepCopyConstructor(ShallowDeepCopyConstructor s) {
        this.number = s.number;
        this.address = s.address; //shallow copy - references shared - Ban
         //this.address = new Address(s.address.add); // deep copy - separate objects - hyd
    }

    public static void main(String[] args) {
        Address a1 = new Address("Hyderabad");
        ShallowDeepCopyConstructor sd = new ShallowDeepCopyConstructor(1,a1);
        ShallowDeepCopyConstructor sd2 = new ShallowDeepCopyConstructor(sd);
        sd2.address.add = "Bangalore";
        System.out.println(sd2.address.add);
        System.out.println(sd.address.add);
     }
}
//reference copy - ShallowDeepCopyConstructor sd2 = sd; - same object , not copy - Assignment	same reference
//Copy Constructor - ShallowDeepCopyConstructor sd2 = new ShallowDeepCopyConstructor(sd); - new object




