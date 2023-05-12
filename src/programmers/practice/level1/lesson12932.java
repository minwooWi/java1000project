package programmers.practice.level1;

import java.util.Arrays;

public class lesson12932 {

    public static int[] solution(long n) {
        char[] ch = String.valueOf(n).toCharArray();
        int[] answer = new int[ch.length];
        int arrIdx = 0;
        for(int i= ch.length-1; i >= 0; i--){
            answer[arrIdx] = Integer.parseInt(String.valueOf(ch[i]));
            arrIdx++;
        }


        return answer;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }
}
