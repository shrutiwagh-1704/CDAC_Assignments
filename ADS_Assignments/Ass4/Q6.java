// Q6. Sorting Strings in Lexicographic Order (using Bubble Sort)

import java.util.Arrays;

public class Q6 {

    static void sortStrings(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
               
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] arr1 = {"apple", "banana", "cherry", "date"};
        sortStrings(arr1);
        System.out.println(Arrays.toString(arr1));
        

        String[] arr2 = {"dog", "cat", "elephant", "bee"};
        sortStrings(arr2);
        System.out.println(Arrays.toString(arr2));
      
    }
}