package acmicpc.입출력;

import java.util.*;

public class problem_2164 {
    public static void main(String[] args) {
//        234 1. 맨 앞자리 한개를 버린다.
//        342 2. 맨 앞자리 한개를 맨 뒤로 보낸다.
//        42 3. 맨 앞자리 한개를 버린다.
//        24 4. 맨 앞자리 한개를 맨 뒤로 보낸다.
//        4 5. 맨 앞자리 한개를 버린다.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        Queue<Integer> qu = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            qu.offer(i);
        }

        System.out.println(qu);

        while (qu.size() > 1){
            qu.poll();
            qu.offer(qu.poll());
        }

        System.out.println(qu);

    }
}