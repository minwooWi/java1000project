package programmers.practice.level2;

import java.util.Arrays;

public class lesson42885 {
    public static int solution(int[] people, int limit) {
        int answer = 0;
        int min = 0;
        Arrays.sort(people);

        //초기값 배열원소중 최대값.
        //종료값 최소값이 최대값과 작거나 동일할때 =
        //증감식 최대값 인덱스를 하나씩 거꾸로 내려오면서. 값을비교한다.

        for (int max = people.length - 1; min <= max; max--){
            if (people[min] + people[max] <= limit) min++;
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{70, 50, 80, 50},100));
    }
}
