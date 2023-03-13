package programmers.level2;

public class lesson12945 {
    public static int solution(int n) {
        int[] fibo = new int[n+1];
        fibo[0] = 0;
        fibo[1] = 1;

        for(int i=2; i <= n; i++){
            fibo[i] = (fibo[i-1] + fibo[i-2]) % 1234567;
        }

        return fibo[n];

    }

    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}
