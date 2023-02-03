package acmicpc.입출력;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem_2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++) {
            for(int j=i+1; j<=num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}