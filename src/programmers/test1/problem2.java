package programmers.test1;

import java.util.Arrays;

public class problem2 {
    public static int solution(int[] people, int[] tshirts) {
        int answer = 0;
        int j = tshirts.length -1;
        Arrays.sort(people);
        Arrays.sort(tshirts);

        for(int i=people.length-1; i>=0; i--){
            if(people[i] == tshirts[j]){
                j--;
                answer+= 1;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        //expect 2
        System.out.println(solution(new int[]{2, 3}, new int[]{1,2,3}));
    }
}
