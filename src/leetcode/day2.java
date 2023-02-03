package leetcode;

import java.util.Arrays;

public class day2 {
    public static int pivotIndex(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();
        int leftSum = 0;
        int pivotIndex = 0;

        for(int i=0; i<nums.length; i++){
            pivotIndex = i;
            totalSum -= nums[i];
            if(totalSum == leftSum){
                return pivotIndex;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,7,3,6,5,6};
        pivotIndex(a);
    }

}
