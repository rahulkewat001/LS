package dsa.Rahul;

public class SearchInMountain {

    int search(int[] arr, int target){
        int peak = peakIndexMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        // Try to search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }
    public int peakIndexMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid -1;
                end = mid;
            }
            else{
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one that is what the checks say
        return start; // or return end as both are =
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){
//        int start = 0;
//        int end = arr.length-1;

        // find weather the array is sorted in asc or desc
        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            // Find the middle element
            int mid = start + (end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            } else {
                if(target>arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {

    }
}
