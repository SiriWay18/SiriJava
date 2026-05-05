package BASICS.Loops;

public class Armstrong {
    public void armstrong(int n){
        int count = 0;
        int dup = n;
        int sum=0;
        int a = n;
        while (dup>0){
            dup=dup/10;
            count++;
        }
        while(a>0){
            int b  = a % 10;
            sum +=Math.pow(b,count);
            a=a/10;
        }
        System.out.println("Count = " + count);
        System.out.println("Sum = " + sum);
        if(sum==n){
            System.out.println(n+ " is a  Armstrong");
        }else {
            System.out.println(n+ " is not a  Armstrong");
        }
    }
    public void sumOfDigits(int n){
        int sum=0;
        while(n>0){
        int a  = n % 10;
        sum += a ;
        n=n /10;
        }
        System.out.println("Sum = " + sum);
    }

}
