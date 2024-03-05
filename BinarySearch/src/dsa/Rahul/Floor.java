package dsa.Rahul;

public class Floor {

    static int floor(int[] arr, int target){ // return the index of smallest no <= target
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
        return end;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 9;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
}
