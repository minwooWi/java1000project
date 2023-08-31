package javaPractice;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {-22,-35,100,35,22,1,15,40,58};

        for (int lastIndex = arr.length-1; lastIndex > 0; lastIndex--) {
            for (int i = 0; i < lastIndex; i++) {
                if(arr[i] > arr[i + 1]){
                    swap(arr , i , i + 1);
                }
            }
        }

        for (int n : arr) {
            System.out.println(n);
        }
    }

    public static void swap(int[] param, int i ,int j){
       if (i == j) return;

       int temp = param[i];
       param[i] = param[j];
       param[j] = temp;

    }

}
