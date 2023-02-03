package programmers.level0;

public class courses_30_letter {
    public static void solution(String message) {
        int answer = 0;

        answer = message.length();

        System.out.println(answer*2);
    }
    public static void main(String[] args) {
        solution("happy birthday!");
    }
}
