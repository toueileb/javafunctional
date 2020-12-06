package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        int increment = incrementByOne(0);

        System.out.println(increment);

        // Function takes 1 argument and produces 1 result
        Integer increment2 = incrementByOneFunction.apply(1);

        System.out.println(increment2);

        Integer multiply = multiplyBy10Function.apply(increment2);

        System.out.println(multiply);

        Function<Integer, Integer> addByOneThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);

        System.out.println(addByOneThenMultiplyBy10.apply(4));

        // BiFunction takes 2 arguments and produces 1 result

        System.out.println(incrementByOneAndMultiply(4,100));

        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100));

    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static int incrementByOne(int number){
        return number + 1;
    }

    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunction = (numberToIncrementByOne,numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number,int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }
}
