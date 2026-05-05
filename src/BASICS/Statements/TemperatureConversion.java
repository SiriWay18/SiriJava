package BASICS.Statements;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your input type Celsius(C) / Fahrenheit(F) / Kelvin(K)");
        String input = sc.nextLine();
        System.out.println(" enter your output type converstion need  C / F / K");
        String output = sc.nextLine();
        System.out.println(" enter your temperature in degrees");
        double temperature = sc.nextDouble();
        double result=0 ;
        if(input.equals("C")){
            if(output.equals("F")){
              result =temperature * (9.0/5) + 32 ;
             System.out.println("Fahrenheit is "+result);
            }else{
              result = temperature + 273;
              System.out.println("Kelvin is "+result);
        }
    }else if(input.equals("F")){
            if(output.equals("C")){
                result = (temperature - 32) * (5.0/9);
                System.out.println("Celsius is "+result);
            }else{
                result =(temperature- 32) * (5.0/9) + 273;
                System.out.println("Kelvin is "+result);
            }
        }else {
            if(output.equals("C")){
                result = (temperature - 273);
                System.out.println("Celsius is "+result);
            }else{
                    result = ((temperature - 273) * (9.0/5)) + 32 ;
                    System.out.println("Fahrenheit is "+result);
            }
        }

}}

