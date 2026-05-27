package BASICS.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class List01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for(int i = 0 ; i<list.size();i++){
            System.out.println(list.get(i));
        }
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for(int e : list){
            System.out.println(e);
        }
        list.stream().forEach(elements -> System.out.println(elements));

    }

}
