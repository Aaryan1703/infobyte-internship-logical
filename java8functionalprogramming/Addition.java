package java8functionalprogramming;

import static java8functionalprogramming.Calculator.bye;

@FunctionalInterface
interface Calculator{
    void add(int a,int b);

    default void hello(){
        System.out.println("Hello buddy");
    }
    static void bye(){
        System.out.println("By Everyone");
    }
}

public class Addition {
    public static void main(String[] args) {

        Calculator c=(a,b)-> System.out.println(a+b);
        c.add(5,10);

        bye();
        Calculator.bye();
        c.hello();
    }
}
