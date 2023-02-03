package acmicpc.입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String getsu = br.readLine();

        // 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
        // 입력받은 정수만큼 줄이생성되어아햔다.
        // 각 행별로 별 갯수도 증가해야한다.
        // 별은 문자 , 별갯수는 숫자 . 어떻게 증가시킬것인가?
        for (int i = 1; i <=Integer.parseInt(getsu) ; i++) {
            String star = "*";
            star = star.repeat(i);
            System.out.println(star);
        }
    }
}