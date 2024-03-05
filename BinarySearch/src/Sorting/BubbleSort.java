package Sorting;
import java.util.Arrays;
public class BubbleSort {

    static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for(int i=0; i<arr.length; i++) {
            swapped = false;
            // for each steps, max item will come at the last respective index
            for(int j=1; j<arr.length-i; j++) {
                // swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you didn't swap for a particular value of i, it means array is sorted hence stop
            if( !swapped) { // !false = true
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
}
