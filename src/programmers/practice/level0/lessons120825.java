package programmers.practice.level0;

import java.util.ArrayList;
import java.util.Arrays;

public class lessons120825 {
    public static String solution(String my_string, int n) {
        String answer = "";
        StringBuffer str = new StringBuffer("");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(my_string.split("")));

        for (String s:list) {
            str.append(String.valueOf(s).repeat(n));
        }

        System.out.println(str);

        return answer;
    }

    public static void main(String[]args){
        System.out.println(solution("hello",3));
    }
}
