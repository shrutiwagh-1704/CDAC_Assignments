

import java.util.Arrays;

public class Q3 {

    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {64, 25, 12, 22, 11};
        selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        

        int[] arr2 = {29, 10, 14, 37, 13};
        selectionSort(arr2);
        System.out.println(Arrays.toString(arr2));
        
    }
}