package BASICS.Collections.SortingCC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student01{
    int id;
    String name;
    Student01(int id,String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public String toString() {
        return "Student01{id=" + id + ", name='" + name + "'}";
    }
}
class NameComparator implements Comparator<Student01> {

    @Override
    public int compare(Student01 s1, Student01 s2){
        return s1.name.compareTo(s2.name);
    }
}
public class ComparatorCustom {
    public static void main(String[] args) {
        List<Student01> list = new ArrayList<>();
        list.add(new Student01(103 ,"Siri"));
        list.add(new Student01(101,"Sireesha"));
        list.add(new Student01(102,"Sirish"));
        Collections.sort(list,new NameComparator());
        System.out.println(list);

        //Anonymous Class Comparator
      /*  Collections.sort(list,new Comparator<Student01>(){
            @Override
            public int compare(Student01 s1,Student01 s2){
                return s1.name.compareTo(s2.name);
            }
        }); */

    }


}

/*
Comparable gives - One Sorting logic but bussiness requirements changes

Comparator Interface :
public interface Comparator<T>{
    int compare(T o1,T o2); }
 */