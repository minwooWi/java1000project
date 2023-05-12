package acmicpc.study;

import java.util.*;
import java.io.*;

public class problem_10819{
    public static int n;
    public static int[] arr;
    public static int[] ans;
    public static boolean[] visit;
    public static int result;

    public static void dfs(int cnt){
        if(cnt == n) {
            int sum = 0;
            for(int i = 0; i < n-1; i++) { //i는 0부터 5까지 증가. ans[0] - ans[1] , ans[1] - ans[2]
                sum += Math.abs(ans[i] - ans[i+1]);
            }
            result = Math.max(result, sum);
            return;
        }
        for(int i = 0; i < n; i++) {
            if(!visit[i]){ // visit[i] 번째 원소가 false 일떄 = 방문하지않았으면.
                ans[cnt] = arr[i];  // 최초 입력된 배열원소의 값을 임시배열에 복사한다.
                visit[i] = true;    // 해당자리수는 방문했기때문에 방문으로 변경처리
                dfs(cnt + 1);   //
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt(); // 배열의 길이값 입력
        arr = new int[n];   // 입력된 길이값 배열 초기화
        ans = new int[n];   // 입력된 길이값 임시 순열 배열 초기화
        visit = new boolean[n]; // 각 자릿수마다의 방문 여부 false 초기화
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt(); // 입력된 숫자로 배열을 초기화.
        }
        result = 0; // result 변수 초기화
        dfs(0);
        System.out.println(result);
    }

}
