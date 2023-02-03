package programmers.practice.level0;

import java.util.Arrays;

public class lessons120841 {
    public static int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];

//        x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다.
//        x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다.
//        x 좌표와 y 좌표가 모두 음수이면 제3사분면에 속합니다.
//        x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.

        if(x > 0 && y > 0){
            answer = 1;
        }else if(x < 0 && y > 0){
            answer = 2;
        }else if(x < 0 && y < 0){
            answer = 3;
        }else{
            answer = 4;
        }


        return answer;
    }

    public static void main(String[]args){
        System.out.println(solution(new int[]{-7,9}));
    }
}
