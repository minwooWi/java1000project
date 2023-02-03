package codeup.기초100제;

import java.util.Scanner;

public class 문제1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        int a = sc.nextInt();
        String oct = Integer.toOctalString(a);
        System.out.println(oct);
    }
}