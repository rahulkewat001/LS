import java.util.Arrays;
import java.util.*;
public class TwoDArrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int arr[][] = new int[3][3];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }


        for(int a[] : arr){
            System.out.println(Arrays.toString(a));
        }
        sc.close();
    }
}
