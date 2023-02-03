package programmers.practice.level0;

import java.util.Arrays;

public class lessons120836 {
    public static int solution(int n) {
        // 주어진 정수 20 이하의 자연수들의 곱이 20이 되는 자연수 갯수를 찾아라~
        // 첫번쨰 : 인덱스와 마지막인덱스값을 하나씩 뽑아와서 결과값이 20 이면 cnt++ / 2,3번째 케이스가 안걸려서 의미없음 X

        // 두번째 : 0번째 인덱스를 나머지 배열의값과 하나씩 전부 비교.
        // 비교가끝나면 1번째 인덱스값과 0번째와 나머지 모든 인덱스와 비교.
        // 시간초과

        // n 을 i 로 나머지가 0일때 1 아니면 0

        int answer = 0;
        for (int i = 1; i <= n; i++)
            answer += n % i == 0 ? 1 : 0;
        return answer;
    }

    public static void main(String[]args){
        System.out.println(solution(100));
    }
}
