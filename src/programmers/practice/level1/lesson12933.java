package programmers.practice.level1;

import java.util.*;

@FunctionalInterface
interface MyLambdaFunction {
    int max(int a, int b);
}

public class lesson12933 {

    public static long solution(long n) {

        MyLambdaFunction lambdaFunction = (int a, int b) -> a > b ? a : b;
        System.out.println(lambdaFunction.max(3, 5));


        return Long.parseLong(
                Arrays.stream(String.valueOf(n).split(""))
                        .sorted(Comparator.reverseOrder())
                        .reduce("", String::concat));
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));

    }
}
