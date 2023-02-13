package programmers.styudy;

import java.util.Arrays;

public class study64708 {
    public static int solution(int[] budgets, int M) {
        //해결
        int answer = 0;
        //예산 정렬
        Arrays.sort(budgets);
        //최소값
        int left = 0;
        //최대값
        int right = budgets[budgets.length - 1];
        //중간값
        int mid = 0;
        //최소,최대값이 일치할때까지.
        while (left <= right) {
            //중간값
            mid = (left + right) / 2;
            //총합
            int sum = 0;

            for (int budget : budgets) {
                //각지방예산이 "중간값" 보다 크면.
                if (budget > mid) {
                    //총합에 값을더한다.
                    sum += mid;
                } else {
                    //값이 크지않으면 예산을 총합에더한다.
                    sum += budget;
                }
            }

            //루프를 돌고 나온 총합이 예산보다크면
            //최대값을 중간값-1 -- 연산을 통해 최대값 낮추기.
            if (sum > M) {
                right = mid - 1;
                //총합이 예산보다 크지않다면 최소값을 중간값+1 ++ 연산을 통해 최소값 증가시킨다.
                //해당 금액을 상한액으로 리턴
            } else {
                left = mid + 1;
                answer = mid;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        //expect 127
        System.out.println(solution(new int[]{120, 110, 140, 150}, 485));

    }
}
