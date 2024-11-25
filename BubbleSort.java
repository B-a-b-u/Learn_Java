
import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] arr){
        int t;
        for(int i=arr.length-1; i >= 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }   
        }
        // return arr;
    } 
    public static void main(String[] args) {
        int[] nums= {10,30,40,20,60,50};
        sort(nums);
        System.out.println("After Sorting :"+Arrays.toString(nums));
    }
}
