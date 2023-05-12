package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sample {
        public static void main(String[] args) {
                // 원본 List
                List<String> list = new ArrayList<>(Arrays.asList("A", "B", "E", "F"));

                // index 2 에 새로운 값 추가
                list.add(2, "C");

                System.out.println(list);  // [A, B, C, D, E, F]

                // index 3 에 새로운 값 추가
                list.add(3, "D");

                System.out.println(list);  // [A, B, C, D, E, F]
        }
}
