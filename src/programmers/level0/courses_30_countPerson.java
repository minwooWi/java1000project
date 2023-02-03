package programmers.level0;

public class courses_30_countPerson {
    public static void solution(int[] array, int height) {
        int answer = 0;

        for(int RR:array){
            if(RR > height){
                answer += 1;
            }
        }

        System.out.println(answer);
    }
    public static void main(String[] args) {
        int[] a = {149, 180, 192, 170};
        solution(a,167);
    }
}
