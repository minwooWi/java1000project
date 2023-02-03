package acmicpc.입출력;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem_2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        // 첫번째 반복문이 돌때에 공백 2개 * 공백 2개
        // 두번째 공백 1개 * 공백 1개
        // N번째 N번째 줄에는 별 2×N-1개를 찍는 문제

        for(int i = 1; i <= num; i++) {

            // 공백찍기
            for(int j = i; j < num; j++) {
                System.out.print(" ");
            }

            // 별찍기
            for(int k = 0; k < i*2-1; k++) {
                System.out.print("*");
            }
            //줄바꿈
            System.out.println();
        }
    }
}