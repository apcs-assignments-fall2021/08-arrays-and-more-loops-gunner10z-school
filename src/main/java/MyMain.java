import java.util.Arrays;

public class MyMain {

    // Rotates all values in an array to the left
    // Ex. rotateLeft([1, 2, 3, 4, 5]) => [2, 3, 4, 5, 1]
    public static int[] rotateLeft(int[] arr) {
        int newArr[]=new int[arr.length];
        for (int i=0;i<arr.length-1;i++){
            newArr[i]=arr[i+1];
        }
        newArr[arr.length-1]=arr[0];
        return newArr;
    }

    // Rotates all values in an array to the right
    // Ex. rotateRight([1, 2, 3, 4, 5]) => [5, 1, 2, 3, 4]
    public static int[] rotateRight(int[] arr) {
        int newArr[]=new int[arr.length];
        for (int i=1;i<arr.length;i++){
            newArr[i]=arr[i-1];
        }
        newArr[0]=arr[arr.length-1];
        return newArr;
    }

    // Replaces all duplicate values with -1
    // Ex. duplicateReplacer([1, 2, 1, 2, 1, 1]) => [1, 2, -1, -1, -1, -1]
    public static int[] duplicateReplacer(int[] arr) {
        int newArr[]=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<newArr.length;j++){
                if (arr[i]==newArr[j]) {
                    newArr[i] = -1;
                }
            }
            if (newArr[i]!=-1){
                newArr[i]=arr[i];
            }
        }
        return newArr;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
