package programmers.level0;

import java.util.Arrays;

public class courses_30_side {
    public static void solution(int[] sides) {
        int answer=0;
        int index=0;
        int sideSum1=0;
        int sideSum2=0;
        Arrays.sort(sides);

        for(int i:sides){
            if(index == 0 || index == 1){
                sideSum1 += i;
            }else{
                sideSum2 += i;
            }
            index++;
        }

        if(sideSum1 >= sideSum2){
            answer=2;
        }else{
            answer=1;
        }
        System.out.println(answer);
    }
    public static void main(String[] args) {
        int[] a = {199, 72, 222};
        solution(a);
    }
}
