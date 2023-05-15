package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static int[] solution(int[] numbers, int target) {
        int[] result = new int[2];
        HashMap<Integer , Integer> hm = new HashMap<Integer , Integer>();

        for (int i = 0; i < numbers.length; i++) {
            if(hm.containsKey(target - numbers[i])){
                return new int[]{hm.get(target - numbers[i]) , i};
            }

            hm.put(numbers[i] , i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3,2,4}, 6)));
    }
}




