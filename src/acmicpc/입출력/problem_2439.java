package acmicpc.입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        // 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
        // 첫번째 반복문 = 각 행이 끝날때마다 개행문자 추가.
        // 두번째 반복문 = 각행의 N-i 만큼의 공백 갯수 생성 추가
        // 세번째 반복문 = 각행의 N 갯수만큼 별갯수 생성 추가


        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 1; j--) {
                sb.append(" ");
            }
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}