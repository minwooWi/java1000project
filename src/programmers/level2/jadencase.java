package programmers.level2;

public class jadencase {
    public static void solution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        System.out.println(answer);
    }
    public static void main(String[] args) {
        String a = "3people unFollowed me";
        solution(a);
    }
}
