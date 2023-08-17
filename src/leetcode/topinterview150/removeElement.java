package leetcode.topinterview150;

public class removeElement {
    static class Solution {
        public int removeElement(int[] nums, int val) {
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[index] = nums[i];
                    index++;
                }
            }
            return index;
        }
    }

    public static void main(String[] args) {
        Solution ar = new Solution();
        System.out.println(ar.removeElement(new int[]{3,2,2,3},3));
    }
}
