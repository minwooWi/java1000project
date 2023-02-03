package acmicpc.DP;

import java.util.Scanner;

public class memoization
{
    static long[] memo = new long[101];
    public static long fibonacci(int n) {
        if (n <= 1)
            return n;
        else if (memo[n] != 0)
            return memo[n];
        else
            return memo[n] = fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(fibonacci(N));
    }
}