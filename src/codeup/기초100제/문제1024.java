package codeup.기초100제;

import java.util.Scanner;

public class 문제1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] strArray = str.split("");

        for (String a:strArray) {
            System.out.println(String.format("\'%s'",a));
        }
    }
}