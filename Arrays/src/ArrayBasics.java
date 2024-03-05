import java.util.*;
public class ArrayBasics {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
//        int arr[] = {1,4,3,2,5};
        // This is an Array of primitives
//        for(int i=0; i<5; i++){
//            arr[i] = sc.nextInt();
//        }
//        for(int i=0; i<5; i++){
//            System.out.print(arr[i] + " ");
//        }   Very long Method

//        for(int num : arr){
//            System.out.print(num + " ");
//        }
//        System.out.println(Arrays.toString(arr)); bestmethod

        // primitives are stored in stack memory
        //and all the arrays, strings and objects are stored in heep memory


        // Arrays of objects
        String str[] = new String[4];
        for(int i=0; i<str.length; i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));
        sc.close();
    }
}
