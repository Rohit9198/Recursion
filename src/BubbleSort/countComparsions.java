package BubbleSort;

import java.util.Arrays;

public class countComparsions {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        int count = bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Total count:" +count);
    }
    static int bubbleSort(int[] arr){
        int n = arr.length;
        int count = 0;

        for(int i=0; i< n-1 ; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                count++;

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        return count;
    }
}
