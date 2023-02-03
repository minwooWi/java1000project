package acmicpc.입출력;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem_2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        // 첫번째 반복문이 돌때 공백의 개수는 0개
        // 두번째 반복문은 공백의 갯수는 1개
        // 각 행 마다 공백이 N-1 만큼 생성되어야함.

        for(int i=0; i<num; i++) {
            for(int j=num-i; j<num; j++) {

                System.out.print(" ");

            }

            for(int k=i; k<num; k++) {

                System.out.print("*");

            }
            System.out.println();
        }
    }
}