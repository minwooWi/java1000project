package programmers.level0;

public class courses_30_iceamericano {
    public static void solution(int money) {
        int coffee = 5500;
        int[] answer = new int[2];

        if(money > 0 || money < 1000000){
            answer[0] = money/coffee;
            answer[1] = money%coffee;
        }

        System.out.println(answer);
    }
    public static void main(String[] args) {
        int a = 5500;
        solution(a);
    }
}
