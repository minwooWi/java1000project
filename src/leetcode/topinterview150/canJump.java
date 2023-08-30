package leetcode.topinterview150;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class canJump {
    public static boolean canJump(int[] nums) {
        int maxIndex=0;

        for(int i=0; i<nums.length; i++){
            if(i > maxIndex){
                return false;
            }
            maxIndex = i+nums[i];
            if(maxIndex >= nums.length-1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{3,0,8,2,0,0,1}));
    }
}
