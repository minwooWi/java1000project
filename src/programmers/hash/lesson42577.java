package programmers.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class lesson42577 {

    public static boolean solution(String[] phone_book) {
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) { // 다음 전화번호가 현재 전화번호의 접두어인 경우
                return false;
            }
        }
        return true; // 모든 전화번호가 서로 접두어가 아닌 경우
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"119", "97674223", "1195524421"} ));
    }
}
