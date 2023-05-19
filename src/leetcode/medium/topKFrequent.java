package leetcode.medium;

import java.util.*;
import java.util.stream.Collectors;

public class topKFrequent {
    public static int[] solution(int[] nums, int k) {
        //1. Map Key:Value 형태로 빈도수 저장한다.
        //2. 저장한 빈도수 순서대로 heap 저장
        //3. 저장한 heap k 크기가 만큼 반환

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){ map.put(num, map.getOrDefault(num, 0) + 1); }

        Queue<Integer> heap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for(int key : map.keySet()){ heap.add(key); }

        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = heap.poll();
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 1, -1, 2, -1, 2, 3}, 2)));

    }
}
