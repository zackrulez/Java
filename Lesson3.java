/**
 * Java 1. Homework 3
 *
 * @author Andrey Z
 * @version 22.01.2022
 */
import java.util.Arrays;

class Lesson3{
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        printlenInit(lenInit(5, 3));
    }
    static void invertArray() {
        int[] arr = {1, 0, 1, 1, 0, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        for (int a : arr) {
            System.out.println(a);
            }
            System.out.println(Arrays.toString(arr));
    }

    static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
        arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        for (int a : arr) {
            System.out.println(a);
        }System.out.println(Arrays.toString(arr));
        
    }
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i -1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
    }
    }
    public static int[] lenInit(int len, int initialValue){
    int arr[] = new int[len];
    for (int i = 0; i < arr.length; i++){
        arr[i] = initialValue;
    }
    return arr;
}
    public static void printlenInit(int[] lenInit) {
    for (int i = 0; i < lenInit.length; i++) {
        System.out.print(lenInit[i] + " ");
    }
    System.out.println();
}


}