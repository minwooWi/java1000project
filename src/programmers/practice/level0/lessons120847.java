package programmers.practice.level0;

    import java.util.Arrays;

public class lessons120847 {
    public static int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);
        answer = numbers[numbers.length-1] * numbers[numbers.length-2];

        System.out.println(numbers[numbers.length-1] * numbers[numbers.length-2]);

        return answer;
    }

    public static void main(String[]args){
        System.out.println(solution(new int[]{0, 31, 24, 10, 1, 9}));
    }
}
