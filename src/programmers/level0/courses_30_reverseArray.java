package programmers.level0;

import java.util.Arrays;

public class courses_30_reverseArray {
    public static void  solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[num_list.length - 1 - i] = num_list[i];
        }
        System.out.println(Arrays.toString(answer));
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        solution(a);
    }
}
