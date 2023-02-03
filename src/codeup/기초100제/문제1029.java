package codeup.기초100제;

import java.util.Scanner;
import java.util.Stack;

public class 문제1029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        String str = String.format("%.11f", num);
        System.out.println(str);
    }
}