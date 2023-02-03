package programmers.level2;

import java.util.Arrays;


public class makeMinArray {
    public static void solution(int []A, int []B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - 1 - i];
        }
        System.out.println(answer);
    }
        public static void main(String[] args) {
            int [] a = {1,2};
            int [] b = {3,4};
            solution(a,b);

        }
}
