package programmers.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class lesson1845 {

    public static int solution(int[] nums) {
        //1. 최대값을구한다.
        int max = nums.length/2;
        //2. 중복을 제거한다.
        HashSet <Integer> arr = new HashSet<>();

        for(int c : nums){
            arr.add(c);
        }
        //3. 조건식을 세운다.
        if(arr.size() > max){
            return max;
        }else{
            return arr.size();
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,1,2,3}));
    }
}
