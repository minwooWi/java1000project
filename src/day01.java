import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class day01 {
    public static void main(String[] args) {
        String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"};

        String answer = getAnswer(strArr);
        String question = getScrambledWord(answer);

        System.out.println("Question:"+question);
        System.out.println("Answer:"+answer);
    } // main

//    [문제1] 다음의 예제를 완성하시오.
//
//    getAnswer(String[] strArr)는 배열strArr의 요소중의 하나를 임의로 골라서 반환한다.(Math.random()사용)
//
//    getScrambledWord(String str)는 주어진 문자열 str의 각 문자의 순서를 뒤섞은 다음, 새로운 문자열로 반환한다.
//
//    (Math.random()사용)
//    [실행결과]
//
//    Question:HEPO
//    Answer:HOPE
//
//    [참고]Math.random()을 사용하기 때문에 위의 실행결과와 다를 수 있습니다.
    public static String getAnswer(String[] strArr) {
        // 내용을 완성하세요.
        int idx = (int)(Math.random()*strArr.length);
        return strArr[idx];
    }

    public static String getScrambledWord(String str) {
        // 내용을 완성하세요.
        char[] chArr = str.toCharArray();//문자열을 받아서 문자단위 배열생성

        for(int i=0; i<str.length(); i++) { //문자열 길이만큼 반복문이 돈다.
            int idx = (int)(Math.random() * str.length());//문자열길이값중 인덱스번호를 랜덤으로가져온다. 1
            char tmp = chArr[i];    //문자단위배열에서 0번째 문자를 임시변수에 저장한다.
            chArr[i] = chArr[idx];  //0번째 문자배열에 있는 문자를 1번째 문자로 변경한다.
            chArr[idx] = tmp;       //1번째 문자배열에있는 문자를 tmp 문자로 변경처리.
        }

        return new String(chArr);
    }
}