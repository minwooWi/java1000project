package programmers.level0;

public class courses_30_arrayLengh {
    public static void solution(String[] strlist) {
        int[] answer = new int[strlist.length];;
        int index=0;
        for (String s : strlist) {
            answer[index] = s.length();
            index++;
        }
        System.out.println(answer);
    }
    public static void main(String[] args) {
        String[] a = {"We", "are", "the", "world!"};
        solution(a);
    }
}
