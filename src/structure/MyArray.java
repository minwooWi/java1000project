package structure;

public class MyArray {

    int[] intArr;
    int count;

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -9;

    public MyArray(){
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size){
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }
}
