package programmers.level0;

public class courses_30_plusArray {
    public static void solution(int n) {
        int answer = 0;
        String a1="";
        String a2="";
        char[] charArr = ("" + n).toCharArray();

        a1.contains(a2);



        for(char rst:charArr){
            answer += Character.getNumericValue(rst);
        }

        System.out.println(answer);
    }
    public static void main(String[] args) {
        solution(1234);
    }
}
