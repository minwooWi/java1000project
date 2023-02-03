package codeup.기초100제;

import java.util.Scanner;

public class 문제1031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String octal = Integer.toOctalString(num);
        String str = String.format("%s", octal);
        System.out.println(str);
    }
}