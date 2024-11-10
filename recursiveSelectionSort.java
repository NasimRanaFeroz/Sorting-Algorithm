import java.util.Arrays;

public class recursiveSelectionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 1, 2 };
        recursiveSelection(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void recursiveSelection(int arr[], int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c <= r) {
            if (arr[c] > arr[max]) {
                recursiveSelection(arr, r, c+1, c);
            } else {
                recursiveSelection(arr, r, c+1, max);
            }
        } else {
            int temp = arr[r];
            arr[r] = arr[max];
            arr[max] = temp;
            recursiveSelection(arr, r-1, 0, 0);
       } 
    } 
}
