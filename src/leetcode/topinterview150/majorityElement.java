package leetcode.topinterview150;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class majorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int n : nums) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }

        ArrayList<Integer> arr = new ArrayList<>(hm.keySet());
        arr.sort((o1, o2) -> hm.get(o2) - hm.get(o1));

        return arr.get(0);
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,3,4}));
    }
}
