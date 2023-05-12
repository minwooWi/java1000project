package leetcode.easy;

import java.util.HashSet;

public class containsDuplicate {
    public static boolean solution(int[] nums) {
        // Base case...
        if(nums==null || nums.length==0)
            return false;
        // Create a hashset...
        HashSet<Integer> hset = new HashSet<Integer>();
        // Traverse all the elements through the loop...
        for(int idx: nums){
            // If it contains duplicate...
            if(!hset.add(idx)){
                return true;
            }
        }
        // Otherwise return false...
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}
