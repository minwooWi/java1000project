package programmers.level2;

import java.util.Arrays;

public class boat {
    public static void solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int min = 0;

        for (int max = people.length - 1; min <= max; max--) {
            if (people[min] + people[max] <= limit) min++;
            answer++;
        }
        int max=Integer.MIN_VALUE;
        System.out.println(answer);
    }
        public static void main(String[] args) {
            solution(new int[]{70, 80, 50}, 100);
        }
}
