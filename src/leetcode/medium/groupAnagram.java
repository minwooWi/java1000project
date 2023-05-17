package leetcode.medium;

import java.util.*;

public class groupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
//        if (strs == null || strs.length == 0) return new ArrayList<>();
        //1. map 변수선언
        //2. 반복문으로 문자열을 가져온다.
        //3. 가져온 문자열을 새롭게 '문자'배열로 선언
        //4. 문자배열 정렬
        //5. 정렬한 문자열을 다시 string 으로 재정의
        //6. 정렬한 문자열로 키값이 존재하지않으면 !map.contatinsKey(keyStr) 재정의한 문자열을 map 에 키값으로 저장하고 밸류값으로 새로운 빈 리스트를 추가한다..
        //7. 정렬된 키값기준으로 map 데이터를 가져오고 해당 리스트에 원소를 추가시킨다. map.get(keyStr).add(s)
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        for (String s :
                strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String keyStr = String.valueOf(ch);
            if(!map.containsKey(keyStr)) map.put(keyStr , new ArrayList<>());
            map.get(keyStr).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));

    }
}




