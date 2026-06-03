package BASICS.Collections.FunctionalInterfaces;
import java.util.Date;
import java.util.function.* ;


public class PredefinedClasses {
    public static void main(String[] args) {
        //1. Predicate
        //ex-1
        Predicate<Integer> predicate = i -> i % 2 == 0;
        System.out.println(predicate.test(10));
        System.out.println(predicate.test(15));
        //ex-2
        String [] s = {"Siri","Sireesha","SriNivasulu","Sridevi" ,"Tejaswani","Teja"};
        Predicate<String> stringPredicate = str -> str.length()>5;
        for(String s1 : s){
            if(stringPredicate.test(s1)){
                System.out.println(s1);
            }
        }
        //ex-3 - Predicate joining
        int[] x = {0,2,4,6,8,10,3,5,7,9,1};
        Predicate<Integer> p1 = i -> i % 2 == 0;
        Predicate<Integer> p2 = i -> i > 4;
        System.out.println("the number is even and greater than 4: ");
        for(int i : x){
            if(p1.and(p2).test(i)){
                System.out.println(i);
            }
        }
        System.out.println("the number is even or greater than 4: ");
        for(int i : x){
            if(p1.or(p2).test(i)){
                System.out.println(i);
            }
        }
        System.out.println("the number is not even : ");
        for(int i : x){
            if(p1.negate().test(i)){
                System.out.println(i);
            }
        }
        //2.Function
        //ex-1
        Function<Integer, Integer> f = i -> i  * i; //square
        System.out.println(f.apply(4));
        System.out.println(f.apply(5) );
        //ex-2
        Function<String, Integer> f1 = s1 -> s1.length(); //square
        System.out.println(f1.apply("Sireesha know what she wants"));
        //ex-3
        Function<Student , String> f2 = c -> {
         int marks = c.marks;
         String grade = "";
         if(marks >= 80) grade = "A";
         else if(marks >= 60) grade = "B";
         else if(marks >= 50) grade = "C";
         else if(marks >= 35) grade = "D";
         else  grade = "E";
         return grade;
        };
        Student[] stu = {
                new Student("Sireesha" , 98),
                new Student("Siri" , 92),
                new Student("teja" , 55),
                new Student("gongora" , 34)
        };
        for(Student s1 : stu){
            System.out.println("Student Name: "+s1.name);
            System.out.println("Student Marks: "+s1.marks);
            System.out.println("Student Grade: "+f2.apply(s1));
        }
        //ex-4
        //Functional channing :
        Function<Integer, Integer> f3 = i -> 2  * i;
        Function<Integer, Integer> f4 = i -> i  * i * i;
        System.out.println(f3.andThen(f4).apply(2));
        System.out.println(f3.compose(f4).apply(2));

        //Consumer
        //ex-1
        Consumer<String> f5 = c -> System.out.println(c);
        f5.accept("Sireesha");
        //ex-2
        Student stud = new Student("Sireesha" , 98);
        Consumer<Student> f6 = c -> System.out.println(stud.name + " is a good girl");
        Consumer<Student> f7 = c -> System.out.println(stud.name + " loves to write code ");
        Consumer<Student> f8 = c -> System.out.println(stud.name + " enjoys her own company more then others");
        Consumer<Student> cc = f6.andThen(f7).andThen(f8);
        cc.accept(stud);

        //Supplier
        //Ex-1
        Supplier<Date> f9 = () -> new Date();
        System.out.println(f9.get());
        //ex-2 (OTP generate)
        Supplier<String> f10 = () ->{
            String otp = "";
            for(int i = 0; i < 6; i++){
                otp = otp+(int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println(f10.get());
        }
}
//class Predicate<Integer>{
//    public boolean test(Integer i ){
//        if(i%2==0){
//            return true;
//        }else{
//            return false;
//        }
//    }
//    (Integer i ) -> i%2 == 0 ;
//
//}


