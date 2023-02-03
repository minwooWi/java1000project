package leetcode;

import java.util.HashMap;

public class day4 {
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;

        String[] arr = t.split("");
        int index = 0, count = 0;
        String sub = String.valueOf(s.charAt(index++));

        for (int i = 0; i < t.length(); i++) {
            if (sub.equals(arr[i])) {
                if (index == s.length()) {
                    count++;
                    break;
                }
                sub = String.valueOf(s.charAt(index++));
                count++;
            }
        }

        if (count == s.length()) return true;
        else return false;
    }

    public static void main(String[] args) {
//        System.out.println(isSubsequence("axc", "ahbgdc"));  // false
//        System.out.println(isSubsequence("abc", "ahbgdc"));  // true
        System.out.println(isSubsequence("acb", "ahbgdc"));  // true
    }
}