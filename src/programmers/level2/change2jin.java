package programmers.level2;

import java.util.Arrays;

public class change2jin {
    public static void solution(String s) {
        int[] answer = new int[2];

        while(s.length() > 1){
            int cntOne=0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '0') answer[1]++;
                else cntOne++;
            }

            s = Integer.toBinaryString(cntOne);
            answer[0]++;
        }

        System.out.println(Arrays.toString(answer));
        // char 배열 출력
//        System.out.println(Arrays.toString(charArr));
    }
        public static void main(String[] args) {
            solution("110010101001");
        }
}
