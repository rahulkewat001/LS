package dsa.Rahul;

public class SmallestLetter {
    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length-1;

        while(start<=end){
            // Find the middle element
            int mid = start + (end-start)/2;

            if(target<letters[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }

        }
        return letters[start % letters.length];

    }

    public static void main(String[] args) {

    }
}
