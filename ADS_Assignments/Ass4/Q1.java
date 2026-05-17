// Q1. Bubble Sort

import java.util.Arrays;

public class Q1 {

    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 2, 9, 1, 5, 6};
        bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));
        

        int[] arr2 = {3, 2, 1};
        bubbleSort(arr2);
        System.out.println(Arrays.toString(arr2));
    

        int[] arr3 = {1, 2, 3};
        bubbleSort(arr3);
        System.out.println(Arrays.toString(arr3));
 
    }
}