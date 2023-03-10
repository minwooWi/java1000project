package programmers.styudy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class study64706 {
    public static String solution(int[] numbers) {
//        String answer =  IntStream.of(numbers)
//                        .mapToObj(String::valueOf)
//                        .sorted((s1,s2)->(s2+1).compareTo(s1+s2))
//                        .collect(Collectors.joining());

        //요구사항 : 순서를 재배치하여 가장 큰수를 문자열로 바꾸어 return
        //풀이순서 : 숫자 > 문자 > 내림차순정렬 > 조합
        String answer = "";
        String[] strArr = new String[numbers.length];

        //1.숫자 > 문자 배열로 전환

        for(int i=0; i<strArr.length; i++){
            strArr[i] = ""+numbers[i];
        }

        Arrays.sort(strArr, (s1,s2) -> (s2+s1).compareTo(s1+s2));
//        for(int i=0; i<strArr.length-1; i++){
//            for(int j=i+1; j<strArr.length; j++){
//                String s1 = strArr[i];
//                String s2 = strArr[j];
//                if((s1+s2).compareTo(s2+s1) < 0){
//                    strArr[i] = strArr[j];
//                    strArr[j] = s1;
//                }
//            }
//        }

        for(String s:strArr){
            answer += s;
        }


        if(answer.startsWith("0")) return "0";
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{6, 10, 2}));


        System.out.println("1".compareTo("2"));
        System.out.println("4".compareTo("3"));

    }
}
