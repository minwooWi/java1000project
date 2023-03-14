package programmers.level2;

import java.util.HashSet;
import java.util.Set;

public class lesson12981 {
    public static int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        //1. 사용한 단어를 확인하기위해 Set 변수선언
        Set<String> usedWords = new HashSet<>();
        //2. 마지막글자를 가져오기위한 변수선언.
        char lastChar = words[0].charAt(0);
        int count = 1;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i != 0) {
                if (lastChar != word.charAt(0) || usedWords.contains(word)) {
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    break;
                }
            }
            usedWords.add(word);
            lastChar = word.charAt(word.length() - 1);
            count++;
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}));

    }
}
