package programmers.practice.level1;

public class lesson12934 {

    public static long solution(long n) {
        long sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt == n) {
            return (sqrt + 1) * (sqrt + 1);
        } else {
            return -1;
        }
    }


    public static void main(String[] args) {
        System.out.println(solution(3));
    }
}
