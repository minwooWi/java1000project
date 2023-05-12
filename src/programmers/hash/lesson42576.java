package programmers.hash;

import java.util.*;

public class lesson42576 {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        // Count the frequency of each name in participant array
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        // Subtract the frequency of each name in completion array
        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }

        // Find the name with non-zero frequency
        for (String name : map.keySet()) {
            if (map.get(name) != 0) {
                answer = name;
                break;
            }
        }

        return answer;

    }

    public static void main(String[] args) {

        System.out.println(solution(new String[]{"leo", "kiki", "eden"} , new String[]{"eden", "kiki"} ));
    }
}
