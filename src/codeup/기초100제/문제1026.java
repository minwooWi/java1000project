package codeup.기초100제;

import java.util.Scanner;

public class 문제1026 {
    public static void main(String[] args) {
        // 17:23:57
        // 23
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String [] strArray  = str.split(":");
        int mm = Integer.parseInt(strArray[1]);

        System.out.println(String.format("%s", mm));
    }
}