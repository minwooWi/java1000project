package codeup.기초100제;

import java.util.Scanner;

public class 문제1020 {
    public static void main(String[] args) {
        //input 000907-1121112
        //ouput 0009071121112
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        String date[] = a.split("[-]");

        String f = date[0];
        String b = date[1];

        System.out.println(String.format("%s%s", f, b));

    }
}
