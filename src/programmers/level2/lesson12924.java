package programmers.level2;

import java.util.Scanner;

public class lesson12924 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            // n이 되는 자연수의 함의 갯수.
            int count = 0;

            // 1부터 N 까지 반복한다.
            for (int i = 1; i <= n; i++) {
                //N 과 비교하기위한 총합.
                int sum = 0;

                //각 자리수마다 순서대로 합을 구하기 위해 이중반복문.
                for (int j = i; j <= n; j++) {
                    sum += j;
                    //만약 합계가 주어진 자연수 n가 동일하다면 자연수의 합의갯수 +1 증가 하고 반복문탈출.
                    if (sum == n) {
                        count++;
                        break;
                    }
                    //만약 합계가 주어진 자연수 n 보다 크다면 만족하는 자연수의합의없기때문에 해당 자연수 반복문 탈출.
                    else if (sum > n) {
                        break;
                    }
                }
            }
            System.out.println(count);
        }
}