package org.amigoscode.functioninterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        //Using Function takes one argument and produces one result.
        int increment = incrementByOne(0);
        System.out.println(increment);

        Integer increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        Integer multiply = multiplyByTenFunction.apply(increment2);
        System.out.println(multiply);

        //combine two functions
        Function<Integer, Integer> add1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyByTenFunction);
        System.out.println(add1AndThenMultiplyBy10.apply(1));

        //Using BiFunction takes two argument and produces one result
        System.out.println(incrementByOneAndMultiply(4, 100));

        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));
    }

    static Function<Integer,Integer> incrementByOneFunction = 
            number -> number + 1;

    static Function<Integer,Integer> multiplyByTenFunction  =
            number -> number * 10;

    static int incrementByOne(int number){
        return number+1;
    }

    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne,numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return (number+1)*numToMultiplyBy;
    }
}
