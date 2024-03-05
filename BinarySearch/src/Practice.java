import java.util.ArrayList;
import java.util.List;
public class Practice {


    public List<Integer> findMissing(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // find missing
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
