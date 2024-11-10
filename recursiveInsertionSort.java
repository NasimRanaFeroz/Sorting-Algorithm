import java.util.Arrays;

public class recursiveInsertionSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 1, 2};
        recursiveInsertion(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void recursiveInsertion(int arr[], int n) {
        if (n < 0) {
            return;
        }

        recursiveInsertion(arr, n - 1);

        int last = arr[n];
        int j = n - 1;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }
}
