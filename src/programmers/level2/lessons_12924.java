package programmers.level2;

import java.util.Arrays;

public class lessons_12924 {
    public static void solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++) {
            int sum = 0;
            for(int j=i; j<=n; j++) {
                sum += j;if(sum==n) {
                    answer++;
                    break;
                } else if(sum>n) {
                     break;
                }
            }
        }

        System.out.println(answer);
        // char 배열 출력
//        System.out.println(Arrays.toString(charArr));
    }
        public static void main(String[] args) {
            solution(15);
        }
}
