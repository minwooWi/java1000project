package acmicpc.study;

import java.util.Arrays;
import java.util.Scanner;

public class problem_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = -1;
        for (int i = 0; i <= n/3; i++) {
            int remaining = n - i*3;
            if (remaining % 5 == 0) {
                count = i + remaining/5;
                break;
            }
        }

        System.out.println(count);
    }
}