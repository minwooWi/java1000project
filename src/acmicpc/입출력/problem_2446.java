package acmicpc.입출력;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem_2446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        // 역삼각형 코드
        for (int i = 0; i < N; i++) {
        //역삼각형 행의 갯수 0,1,2,3,4 한줄한줄증가

            // 공백
            // 1행에 0개
            // 2행에 1개
            // N행에 N-1개
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // 별
            for (int k = 0; k < (2 * N - 1) - (2 * i); k++) {
                System.out.print("*");
            }

            System.out.println();
            //역삼각형 행 하나씩 개행시키기.
        }

        // 삼각형 코드
        for (int i = 0; i < N - 1; i++) {	// N+1 ~ 2N-1

            // 공백
            for (int j = 1; j < (N - 1) - i; j++) {
                System.out.print(" ");
            }

            // 별
            for (int k = 0; k < 3 + 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}