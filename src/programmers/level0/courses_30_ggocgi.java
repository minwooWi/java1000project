package programmers.level0;

public class courses_30_ggocgi {
    public static void solution(int n, int k) {
        int answer = 0;
        int ggochi = 12000 * n;
        int drink  = 2000 * k;
        int s      = 0;

        if(n >= 10){
            s = n/10;
            drink  = 2000 * (k-s);
        }

        answer = ggochi + drink;
        System.out.println(answer);
    }
    public static void main(String[] args) {
        solution(10,3);
    }
}
