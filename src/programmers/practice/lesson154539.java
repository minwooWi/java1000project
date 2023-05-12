package programmers.practice;

import java.util.Arrays;
import java.util.Stack;

public class lesson154539 {

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        Stack<Integer> stack = new Stack<>();

        for (int arrIdx = 0; arrIdx < numbers.length; arrIdx++) {
            while (!stack.isEmpty() && numbers[arrIdx] > stack.peek()){
                int stkIdx = stack.pop();
                answer[stkIdx] = numbers[arrIdx];
            }
            stack.push(arrIdx);
        }
        double average = Arrays.stream(numbers).average().orElse(Double.NaN);

        return answer;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 3, 3, 5})));

    }
}
