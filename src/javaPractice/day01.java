package javaPractice;

import java.util.HashSet;

public class day01 {
    public static HashSet<Integer> getAnswer() {
        int[] numArray = new int[]{1,2,5,7,7,9};
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int n: numArray) {
            hs.add(n);
        }


        return hs;
    }

    public static void main(String[] args) {
        //1 2 3 4 5 6 return true
        //1 3 5 7 7 9 return flase
        System.out.println(getAnswer());
    }
}