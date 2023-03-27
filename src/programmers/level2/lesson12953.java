package programmers.level2;

public class lesson12953 {
    public static int solution(int[] arr) {
        int answer = 1;
        while(true) {
            boolean isAnswer = true;
            for (int i = 0; i < arr.length; i++) {
                if(answer % arr[i] != 0) {
                    isAnswer = false;
                    break;
                }
            }
            if(isAnswer) {
                break;
            }
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,6,8,14}));
    }
}
