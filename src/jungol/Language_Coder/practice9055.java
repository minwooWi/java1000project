package jungol.Language_Coder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice9055 {
    public static void main(String[] args) throws IOException {
        //1부터 차례로 누적하여 합을 구하다가 합이 입력받은 수를 넘으면 중단하고 마지막으로 더해진 값과 그 때까지의 합을 출력하는 프로그램을 작성하시오.
        //반복해서 입력 데이터 읽기
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int str=0;
        int sum=0;

        while ((str = Integer.parseInt(reader.readLine())) != 0) {
            if (str > sum) break;
            sum += str;
            System.out.println(sum);

        }
    }
}
