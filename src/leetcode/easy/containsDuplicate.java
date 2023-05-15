package leetcode.easy;

import java.util.HashSet;

public class containsDuplicate {
    public static boolean solution(int[] nums) {
        HashSet<Integer> hset = new HashSet<Integer>();

        for(int n : nums){
            if(!hset.add(n)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}
