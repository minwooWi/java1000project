package acmicpc.입출력;

import java.util.Scanner;

public class problem_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        int sum=0;
        for (int i = 0; i < nums.length(); i++) {
            char a = nums.charAt(i);
            sum += Character.getNumericValue(a);
        }

        System.out.println(sum);
    }
}