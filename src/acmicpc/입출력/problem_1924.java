package acmicpc.입출력;

import java.util.Scanner;

public class problem_1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        sc.close();
//            1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
        int[] monthOfDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] dayOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int totalDays=day;

        for (int i = 0; i < month-1 ; ++i) {
            totalDays+= monthOfDays[i];
        }

        System.out.println(dayOfWeek[totalDays % 7]);
    }
}