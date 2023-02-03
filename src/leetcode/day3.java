package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class day3 {
    public static boolean isIsomorphic(String s, String t) {
        // Check if the two strings have the same length
        if (s.length() != t.length()) {
            return false;
        }

        // Create hash maps for the two strings
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        // Iterate through the characters in s and t
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // Check if the character s_i is already in the hash map for s
            if (sMap.containsKey(sChar)) {
                // If it is, check that its value is t_i
                if (sMap.get(sChar) != tChar) {
                    return false;
                }
            } else {
                // If it's not, add an entry to the map with s_i as the key and t_i as the value
                sMap.put(sChar, tChar);
            }

            // Check if the character t_i is already in the hash map for t
            if (tMap.containsKey(tChar)) {
                // If it is, check that its value is s_i
                if (tMap.get(tChar) != sChar) {
                    return false;
                }
            } else {
                // If it's not, add an entry to the map with t_i as the key and s_i as the value
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo", "baa"));  // true
        System.out.println(isIsomorphic("foo", "baz"));  // false
        System.out.println(isIsomorphic("abc", "def"));  // true
        System.out.println(isIsomorphic("abc", "dee"));  // false
    }
}