package programmers.level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class lesson12981 {
    public static int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Set<String> usedWords = new HashSet<>();
        char lastChar = ' ';

        for (int i = 0; i < words.length; i++) {
            if (i != 0 && (lastChar != words[i].charAt(0) || usedWords.contains(words[i]))) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            usedWords.add(words[i]);
            lastChar = words[i].charAt(words[i].length() - 1);
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}));

    }
}
