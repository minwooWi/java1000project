package programmers.level2;

import java.util.*;
import java.util.stream.Stream;

public class lesson138476 {
    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> sizeMap = new HashMap<Integer, Integer>();

        // 1. sizeMap data set (귤 사이즈별로 정리)
        for(int size : tangerine) {
            sizeMap.put(size, sizeMap.getOrDefault(size, 0)+1);
        }

        // 2. keyList 생성 (사이즈별 list)
        List<Integer> keyList = new ArrayList<>(sizeMap.keySet());

        // 3. keyList의 value 기준 내림차순 정렬 ( (사이즈별+총개수) 내림차순 list로 만들어줌)
        keyList.sort((o1, o2) -> sizeMap.get(o2) - sizeMap.get(o1));

        // 4. k의 개수만큼 상자에 담으며 최소값 추출
        int i = 0;
        while(k > 0){
            k -= sizeMap.get(keyList.get(i));
            answer++;
            i++;
        }
        return answer;
    }
        public static void main(String[] args) {
            solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
        }
}
