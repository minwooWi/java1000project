package programmers.level0;
import java.util.ArrayList;

public class courses_30_hateOdd {
    public static void solution(int n) {
        ArrayList<Integer> answer1 = new ArrayList<>();

        int index=0;

        for(int i=0; i<=n; i++){
            if(i%2 != 0){
                answer1.add(i);
                index++;
            }
        }

        int[] answer = new int[answer1.size()];
        for(int i = 0; i < answer1.size(); i++) {
            answer[i] = answer1.get(i);
        }
        System.out.println(answer);
    }
    public static void main(String[] args) {
        solution(15);
    }
}
