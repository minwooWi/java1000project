package leetcode;

import java.util.Arrays;

public class running_sum_of_1d_array {
    public static void runningSum(int[] nums) {
        // Output: [1,3,6,10]
        // input 주어진 배열원소를 인덱스 순서대로 더한값을
        // 새로운 배열로 반환한다.
        // 첫번쨰 새로운 배열의 원소는 첫번쨰원소까지의 합
        //
        // 두번쨰 새로울 배열의 원소는 두번째원소까지의 합
        int sums=0;
        int[] newArray = new int[4];

        for(int i=0; i<nums.length; i++){
            sums += nums[i];
            newArray[i] = sums;
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        runningSum(a);
    }

}
