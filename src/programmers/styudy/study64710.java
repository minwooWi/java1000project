package programmers.styudy;

import java.util.Arrays;

public class study64710 {
    public static int solution(int[] A, int[] B) {
        int answer = 0;
        int index = B.length - 1;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = A.length-1; i >= 0; i--) {
            if(A[i] < B[index]){
                index--;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        //expect 3
        System.out.println(solution(new int[]{5,1,3,7}, new int[]{2,2,6,8}));

        //expect 0
        System.out.println(solution(new int[]{2,2,2,2}, new int[]{1,1,1,1}));
    }
}
