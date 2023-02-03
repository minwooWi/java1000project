package programmers.level2;

import java.util.Arrays;

public class correctArray {
    public static void solution(String s) {
        boolean answer;
        int count = 0;
Integer.toBinaryString(1234);
        for(int i=0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == '('){
                count--;
            }
            if (count < 0) break;
        }

        System.out.println(count == 0 ? true : false);
    }
        public static void main(String[] args) {
            String a ="(())";
            solution(a);

        }
}
