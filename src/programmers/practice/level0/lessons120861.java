package programmers.practice.level0;

import java.util.Arrays;

class lessons120861 {
    public static String solution(String[] keyinput, int[] board) {
        int[] temp = board;
        int[] answer = new int[]{0,0};
        int[] upDown = new int[temp[0]];
        int[] leftRIght = new int[temp[1]];
        int j = (temp[0]-1)/2 * -1;
        int k = (temp[1]-1)/2 * -1;

        for (int i = 0; i < temp[0]; i++) {
            upDown[i] = j;
            j+=1;
        }
        for (int i = 0; i < temp[1]; i++) {
            leftRIght[i] = k;
            k+=1;
        }

        System.out.println(Arrays.toString(upDown));
        System.out.println(Arrays.toString(leftRIght));

        for (String s:keyinput) {
            if(s == "left" || s == "right"){
                if(s == "left"){
                    // -1
                    answer[0] = answer[0]-1;
                }else{
                    // +1
                    answer[0] = answer[0]+1;
                }

                //최소값 보다 작거나 , 최대값보다 크다면
                if(upDown[0] > answer[0]){
                    answer[0] = upDown[0];
                }else if(upDown[upDown.length-1] < answer[0]){
                    answer[0] = upDown[upDown.length-1];
                }

            }else if(s == "up" || s == "down"){
                if(s == "down"){
                    // -1
                    answer[1] = answer[1]-1;
                }else{
                    // +1
                    answer[1] = answer[1]+1;
                }

                //최소값 보다 작거나 , 최대값보다 크다면
                if(leftRIght[0] > answer[1]){
                    answer[1] = leftRIght[0];
                }else if(leftRIght[leftRIght.length-1] < answer[1]){
                    answer[1] = leftRIght[leftRIght.length-1];
                }

            }
        }


        return Arrays.toString(answer);
    }

    public static void main(String[]args){
        System.out.println(solution(new String[]{"left", "left", "left", "right"},new int[]{3,3}));
    }
}