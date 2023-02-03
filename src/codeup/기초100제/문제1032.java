package codeup.기초100제;

import java.util.Scanner;

public class 문제1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String octal = Integer.toHexString(num);
        String str = String.format("%S", octal);
        System.out.println(str);
    }
}