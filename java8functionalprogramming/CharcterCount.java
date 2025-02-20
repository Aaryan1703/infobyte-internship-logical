package java8functionalprogramming;

import java.util.function.Function;

public class CharcterCount {

    public static void main(String[] args) {

        Function<String,Integer> function=(input)->{
            if (input==null) return 0;
            return input.length();
        };

        function.apply( "Aryan");
    }
}
