package programmers.level0;

import java.util.Arrays;

public class courses_30_doubleArray {
    public static void solution(int[] numbers) {
        int answer[]=new int[numbers.length];
        int index=0;
        for(int i:numbers){
            answer[index] = i*2;
            index++;
        }

        System.out.println(answer);
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 100, -99, 1, 2, 3};
        solution(a);
    }
}
