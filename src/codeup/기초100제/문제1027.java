package codeup.기초100제;

import java.util.Scanner;

public class 문제1027 {
    public static void main(String[] args) {
        // 17:23:57
        // 23
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] strArray = str.split("\\.");

        int yyyy = Integer.parseInt(strArray[0]);
        int mm = Integer.parseInt(strArray[1]);
        int dd = Integer.parseInt(strArray[2]);

        System.out.println(String.format("%02d-%02d-%d", dd,mm,yyyy));
    }
}