package BASICS.Functions;

public class CallByReference {
    int var ;
    String name;
    public  void cby(CallByReference c){
        System.out.println("Call By References");
        c.var += 10;
        System.out.println("Call By References: "+c.var);
        c.name = "hi " +c.name;
        System.out.println("Call By References: "+c.name);
    }
    public CallByReference cby1(){
        CallByReference c = new CallByReference();
        c.name = "hello" ;
        System.out.println("Call By References: "+c.name);
        c.var = 10;
        System.out.println("Call By References: "+c.var);
        return c;
    }
    public CallByReference cby2(CallByReference c){
        CallByReference d = new CallByReference();
        d.name = "good" + c.name;
        System.out.println("Call By References: "+d.name);
        d.var = 15 + c.var;
        System.out.println("Call By References: "+d.var);
        return d;
    }
    public void cby3(){
        CallByReference c = new CallByReference();
        c.name = "wow";
        System.out.println("Call By References: "+c.name);
        c.var = 10;
        System.out.println("Call By References: "+c.var);
    }

}
