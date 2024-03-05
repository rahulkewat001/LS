package Sorting;
import java.util.Arrays;
public class MissingNumber {

    static int missingNumber(int[] arr) {
        int i=0;
        while(i < arr.length) {
            int correct =  arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for(int index = 0; index<arr.length; index++) {
            if(arr[index] != index) {
                return index;
            }
        }
        // case 2
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,3,4};
        System.out.println(missingNumber(arr));

    }
}
