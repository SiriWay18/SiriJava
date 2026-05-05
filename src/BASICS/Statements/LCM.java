package BASICS.Statements;

public class LCM {
    public void least(int a , int b){
        int j = 0;
        for(int i=1;i<=9;i++){
            if(a%i==0 && b%i==0){
                j=i;
            }}

        int hcf = j%10;
        System.out.print(hcf);
        System.out.println(" ");
        int lc = a*b/hcf;
        System.out.print(lc);
        // some errors need to fix - Math.min(a,b) - need to work on it
    }
}
