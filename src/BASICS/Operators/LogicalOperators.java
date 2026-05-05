package BASICS.Operators;

public class LogicalOperators {
    public LogicalOperators(int a , int b ) {
        System.out.println("&& - and operator if both or all conditions are true then our statement true - " + (a>b && b>a));
        System.out.println("|| - OR operator if any one of the given conditions are true then our statement true - " + (a>b || b>a));
        System.out.println("!- NOT operator if  conditions is true then our output is false - " + (!(a<b)) );
    }
}
