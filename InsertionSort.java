import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 8, 9, 3, 0};
        int current;
        int j;
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            current = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > current)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;


        }
        System.out.println(Arrays.toString(arr));
    }
}
