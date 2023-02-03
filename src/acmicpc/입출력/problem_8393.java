package acmicpc.입출력;

import java.util.Scanner;

public class problem_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sums=0;
        for (int i = 1; i <= num ; ++i) {
            sums+= i;
        }

        System.out.println(sums);
    }
}