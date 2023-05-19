package leetcode.medium;

import java.util.*;

public class productExceptSelf {
    public static int[] solution(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
            //res[1] = res[0] * nums[0] = 1*1;
            //res[2] = res[1] * nums[1] = 1*2;
            //res[3] = res[2] * nums[2] = 2*3;
        }
        //반복문을 한번순회하면서 왼쪽에 있는 원소의 곱을 각 인덱스에 저장시킨다.

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
            //res[3] *= 1
            //1 * =
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4})));

    }
}
