import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 8, 9, 3, 0};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) { //call by reference
        int current;
        int j;
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
    }
}
