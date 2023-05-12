package programmers.level2;

import java.util.Arrays;

public class lesson42842 {
    public static int[] solution(int brown, int yellow) {
        int sum = brown + yellow; // 카펫의 격자 수
        int[] answer = new int[2]; // 가로, 세로 크기를 저장할 배열
        for (int i = 1; i <= sum / 2; i++) {
            // 가로 길이는 세로 길이와 같거나 작기 때문에 반복문의 범위는 격자 수의 절반까지만 설정합니다.
            if (sum % i == 0) { // 가로 길이로 나누어 떨어지는 경우
                int j = sum / i; // 세로 길이를 구합니다.
                int brownCnt = i * 2 + j * 2 - 4; // 갈색 격자의 개수를 구합니다.
                if (brownCnt == brown) { // 주어진 갈색 격자의 개수와 일치하는 경우
                    answer[0] = j; // 세로 길이를 저장합니다.
                    answer[1] = i; // 가로 길이를 저장합니다.
                    break; // 가장 작은 카펫의 크기를 구해야 하기 때문에, 정답을 찾으면 반복문을 종료합니다.
                }
            }
        }
        return answer; // 가로, 세로 길이를 저장한 배열을 반환합니다.

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 2)));
    }

}

