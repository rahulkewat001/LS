package dsa.Rahul;

public class Ceiling {
    static int ceiling(int[] arr, int target){ // return the index of smallest no >=target

        // but what if the target is greater than the greatest number in the array
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            // Find the middle element
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                // answer found
                return mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 14;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
}
