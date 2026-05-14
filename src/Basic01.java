import java.sql.SQLOutput;
import java.util.Scanner;

public class Basic01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("how many months your in Armorize : ");
        int months = sc.nextInt();
        System.out.println("enter your gender(M/F): ");
       char gender = sc.next().charAt(0);
       String m  ;
       if(gender == 'M'){
           m =  "Male";
       }else{
            m =  "Female";
       }
           if(months<=6){
               System.out.print(name + " is a juniors and gender : " + m + " and ");
           }else if(months>=12 ){
               System.out.print(name + " is a Senior and gender : "+ m+ " and ");
           }else{
               System.out.print(name + " is ready to become seniors from juniors and gender : "+ m+ " and ");
           }

            switch(months){
                case 0 :{}
                case 1 : {}
                case 2 : {}
                case 3 : {}
                case 4 : {}
                case 5 : {}
                case 6 : {
                    System.out.println(months + " months in this company ");
                    break;
                }
                case 7 : {}
                case 8 : {}
                case 9 : {}
                case 10 : {}
                case 11 : {}
                case 12 : {
                    System.out.println(months + " months in this company  " );
                    break;
                }
                default : {
                    System.out.println(months + " months in this company  " );
                }
            }

        }

    }


