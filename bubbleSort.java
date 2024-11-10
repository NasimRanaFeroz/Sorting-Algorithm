import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 1, 2 };
        bubbleSorted(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSorted(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < arr.length - i -1; j++) {
              if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                isSwapped = true;
              }  
            }
            if ( !isSwapped ) {
                break; 
            }
        }
        
    }
}
