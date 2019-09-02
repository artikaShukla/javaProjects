package Java8;

import java.util.function.Function;

public class LambdaExpression {

    public static void main(String[] args) {
    LambdaExpression lambdaExpression= new LambdaExpression();
//    lambdaExpression.greet(()->System.out.println("Hello"));
//    Integer i=(int a)->a*2;
    //int x=3;
        Function<Integer,Integer> add = x -> x + 1;
        System.out.println(add.apply(4));

    }

    public String greet(String d){return d;}
}
