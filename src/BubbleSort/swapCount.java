package BubbleSort;

import java.util.Arrays;

public class swapCount {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 4, 2};
        int swaps = bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Total swaps: "+swaps);
    }
    static int bubbleSort(int[] arr){
        int n =arr.length;
        int swapCount = 0;

        for(int i =0; i<n-1; i++){
            for(int j=0; j< n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapCount++;
                }
            }
        }
        return swapCount;
    }
}
