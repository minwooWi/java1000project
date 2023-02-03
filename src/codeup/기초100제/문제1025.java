package codeup.기초100제;

import java.util.Scanner;

public class 문제1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String [] strArray  = str.split("");
        int idx = str.length();

        for (String a:strArray) {
            int num = Integer.parseInt(a);
            if(idx == 5){
                System.out.println(String.format("[%d]", num*10000));
            }
            else if(idx == 4){
                System.out.println(String.format("[%d]", num*1000));
            }else if(idx == 3){
                System.out.println(String.format("[%d]", num*100));
            }else if(idx == 2){
                System.out.println(String.format("[%d]", num*10));
            }else{
                System.out.println(String.format("[%d]", num*1));
            }
            idx--;
        }
    }
}