package dsa.Rahul;

public class BinarySearch {

    static int binarySearch(int[] arr, int target){
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
        return -1;
    }
    public static void main(String[] args) {
        // array should be sorted in binary search
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 22;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
}
