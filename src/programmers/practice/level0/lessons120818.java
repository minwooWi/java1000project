package programmers.practice.level0;

import java.util.ArrayList;
import java.util.Arrays;

public class lessons120818 {
    public static int solution(int price) {
        int answer;

        if( price >= 500000) {
            answer = (int)(price*0.8);
        } else if( price >= 300000){
            answer = (int)(price * 0.9);
        }else if (price >= 100000){
            answer = (int)(price * 0.95);
        } else {
            answer = price;
        }

        return answer;
    }

    public static void main(String[]args){
        System.out.println(solution(580000));
    }
}
