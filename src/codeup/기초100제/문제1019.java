package codeup.기초100제;

import java.util.Scanner;
public class 문제1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        String date[] = a.split("[.]");
        // split()을 이용해 .(닷)을 기준으로 문자열을 잘라 배열에 저장
        // 참고로 .(닷)을 기준으로 나눌때는 [.] 또는 \\.으로 해결

        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        System.out.println(String.format("%04d.%02d.%02d", year, month, day));

    }
}
