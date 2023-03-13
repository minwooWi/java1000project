package programmers.level2;

import java.util.Arrays;

public class lesson42885 {
    public static int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer=0;
        int left=0;
        int right= people.length-1;

        while(left == right){
            if(people[left] + people[right] <= limit){
                left++;
            }
            right--;
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{70,80,50} , 100));
    }
}
