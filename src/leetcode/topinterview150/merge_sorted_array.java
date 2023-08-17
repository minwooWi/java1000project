package leetcode.topinterview150;

import java.util.Arrays;

public class merge_sorted_array {
    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            // i nums1 0으로 시작하는 인덱스 접근 변수
            // j nums2 배열 원소가져오는 변수
            for(int i=m,j=0; j < nums2.length; j++){
                nums1[i] = nums2[j];
                i++;
            }

            Arrays.sort(nums1);

            System.out.println(Arrays.toString(nums1));
        }
    }

    public static void main(String[] args) {
        Solution ar = new Solution();
        ar.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }
}
