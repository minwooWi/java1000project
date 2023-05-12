package programmers.level2;

import java.util.Arrays;
import java.util.Stack;

public class lesson42747 {
    public static int solution(int[] citations) {
        Arrays.sort(citations); // citations 배열을 오름차순으로 정렬
        int hIndex = 0;
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i; // 인용된 논문의 수
            if (citations[i] >= h) { // 현재 논문의 인용 횟수가 h 이상인 경우
                hIndex = h; // H-Index 값을 갱신
                break;
            }
        }
        return hIndex;

    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 0, 6, 1, 5}));
    }
}
