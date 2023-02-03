package programmers.level2;

public class sort_min_max {
    public static void solution(String s) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        String answer = "";
        //1. 문자열을 우선 하나씩 가져와 배열을 만든다.
        String[] strArray = s.split(" ");

        //2. 배열을 돌면서 형변환으 해준다.
        for(String aa : strArray){
            int number = Integer.parseInt(aa);

            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        answer = min +" "+ max;

        System.out.println(answer);
    }
    public static void main(String[] args) {
        String a = "-1 -2 -3 -4";
        solution(a);
    }
}
