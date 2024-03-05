public class Arr2 {

    public static int maxRange(int arr[], int start, int end){
        if(arr==null){
            return -1;
        }
        int maxVal = arr[start];
        for(int i=start; i<=end; i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,23,9,18};
        System.out.println(maxRange(arr,3,4));
    }
}
