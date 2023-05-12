package programmers.level1;

import java.util.*;
import java.util.stream.IntStream;

public class lesson178871 {
    public static String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];

        Map<Integer,String> map = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();

        IntStream.range(0, players.length)
                .forEach(i -> {
                    map.put(i+1, players[i]);
                    map2.put(players[i], i+1);
                });

        for(int i=0;i<callings.length;i++){

            //추월한 선수
            String call = callings[i];

            int idx =map2.get(call);

            //뒤처진 선수
            String a = map.get(idx-1);

            //map2  갱신
            map2.put(call,idx-1);
            map2.put(a,idx);

            //map1 갱신
            map.put(idx-1,call);
            map.put(idx,a);

        }

        int idx=0;
        for(int key:map.keySet()){
            answer[idx++]=map.get(key);
        }

        return answer;
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"})));
    }
}
