package BASICS.Collections.SortingCC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableNatural {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        System.out.println(a.compareTo(b));
        List<Student> list = new ArrayList<>();
        list.add(new Student(103 ,"Siri"));
        list.add(new Student(101,"Sireesha"));
        list.add(new Student(102,"Sirish"));
        Collections.sort(list);
        System.out.println(list);
    }
}
class Student implements Comparable<Student>{
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public int compareTo(Student s){
        return this.id - s.id;
    ////        return Integer.compare(this.id,s.id);
    }
  //  @Override
//    public int compareTo(Student s){
////        int result = Integer.compare(this.id,s.id);
////        if(result!=0)
////            return result;
//
//        return this.name.compareTo(s.name);
//    }

    @Override
    public String toString() {
        return "Student01{id=" + id + ", name='" + name + "'}";
    }
}

/*Comparable → Natural Sorting
             Used when a class itself knows how it should be sorted.
             public interface Comparable<T> {
                         int compareTo(T o);}
| Return Value | Meaning                    |
| ------------ | -------------------------- |
| Negative     | Current object comes first |
| Positive     | Other object comes first   |
| Zero         | Both equal                 |

Comparable gives - One Sorting logic
 */
//Comparator → Custom Sorting
