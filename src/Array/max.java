package Array;

public class max {
    public static void main(String[] args) {
        int[] arr ={1, 3, 23, 9, 18};
        System.out.println(Max(arr));
    }
    //imagine that arr is not empty
    static int Max (int[] arr){
        int maxVal = arr[0];
        for(int i =1; i< arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
