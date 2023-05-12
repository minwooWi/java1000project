package codeup.기초100제;

import java.util.*;

public class 문제1080 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        for(int i=1; i<=num; i++){
            sum = sum + i;
            if(sum >= num){
                System.out.println(i);
                break;
            }
        }
    }
}