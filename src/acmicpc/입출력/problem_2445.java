package acmicpc.입출력;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem_2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        // 별 2개 + 공백 8개
        // 별 4개 + 공백 6개
        // 별 6개 + 공백 4개
        // 별 8개 + 공백 2개
        // 별 10개 + 공백 0개

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int k=1; k<=2*(n-i); k++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=n-1; i>0; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int k=1; k<=2*(n-i); k++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}