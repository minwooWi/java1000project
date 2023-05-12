package programmers.practice.level1;

import java.util.Arrays;

public class lesson12954 {

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        int sum = 2;
        for(int i=0; i < n; i++){
            answer[i] = sum;
            sum += x;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 5)));

    }
}
