package programmers.styudy;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class study64708 {
    public static String solution(int[] numbers) {
        String answer =  IntStream.of(numbers)
                        .mapToObj(String::valueOf)
                        .sorted((s1,s2) -> (s2+s1).compareTo(s1+s2))
                        .collect(Collectors.joining());

        if(answer.startsWith("0")) return "0";
        return answer;
    }

    public static void main(String[] args) {
        //expect "6210"
        System.out.println(solution(new int[]{6, 10, 2}));

        //expect "9534330"
        System.out.println(solution(new int[]{3, 30, 34, 5, 9}));
    }
}
