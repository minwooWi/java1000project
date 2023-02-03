package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeDuplicates {
    public static void solution(int[] nums) {
        int left = 0;
        int count = 1;

        for (int i = 1; i < nums.length;i++) {
            if (nums[i] != nums[left]) {
                left++; // 1번째 배열과 0번째 배열 비교하여 같지않으면 left 값 1증가 ,
                nums[left] = nums[i]; // 0번째 배열의 값을 1번째 배열 값으로 변경한다.
                count++; // count 값 +1 증가
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] a = {0,0,1,1,1,2,2,3,3,4};
        solution(a);
    }
}
