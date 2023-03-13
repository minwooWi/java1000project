package programmers.level2;

public class lesson12911 {
    public static int solution(int n) {
        int answer = 0;
        int oneCount = Integer.bitCount(n);

        for (int i = n + 1; ; i++) {
            if (oneCount == Integer.bitCount(i)) {
                answer = i;
                break;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        System.out.println(solution(78));
    }
}
