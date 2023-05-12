package programmers.level2;

import java.util.Stack;

public class lesson76502 {
    public static int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            String rotated = rotate(s, i);
            if (isValid(rotated)) {
                answer++;
            }
        }
        return answer;
    }

    private static String rotate(String s, int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(x));
        sb.append(s.substring(0, x));
        return sb.toString();
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
    }

}

