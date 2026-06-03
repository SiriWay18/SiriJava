package BASICS.Collections.FunctionalInterfaces;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class CustomerDetailsMain {
    public static void main(String[] args) {
        ArrayList<CustomerDetails>  list = new ArrayList<>();
        list.add(new CustomerDetails(5,"Siri",20,20000.00 ,"laptop" , 2000));
        list.add(new CustomerDetails(6,"Teju",16,16000.00 ,"phone" , 1600));
        list.add(new CustomerDetails(3,"Sai",25,25000.00 ,"Computor" , 2500));
        list.add(new CustomerDetails(4,"Teja",23,23000.00 ,"Car" , 2300));
        list.add(new CustomerDetails(2,"Suneel",29,29000.00 ,"gold" , 2900));
        list.add(new CustomerDetails(1,"Suresh",32,32000.00 ,"house" , 3200));
        //Predicate
        Predicate<CustomerDetails> p = e -> e.age >=19 && e.age <=25;
        for(CustomerDetails c : list){
            if(p.test(c)){
                System.out.println(c);
            }
        }
        //function
        ArrayList<CustomerDetails>  list1 = new ArrayList<>();
        BiFunction<Integer,String, CustomerDetails> cd = (id , name ) -> new CustomerDetails(id , name );
        list1.add(cd.apply(1,"Suresh"));
        list1.add(cd.apply(6,"Teju"));
        list1.add(cd.apply(3,"Sai"));
        list1.add(cd.apply(4,"Teja"));
        list1.add(cd.apply(5,"Suneel"));
        list1.add(cd.apply(6,"Sireesha"));
        for(CustomerDetails c : list1){
            System.out.println("ID: " + c.id);
            System.out.println("Name: " + c.name);
            System.out.println();
        }

    }
}
