import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int i, j;
        int[] arr = {5, 4, 8, 9, 3, 0};
        System.out.println(Arrays.toString(arr));

        for (i = 0; i < arr.length - 1; i++)
            for (j = i + 1; j < arr.length; j++)
                if (arr[i] > arr[j])
                    arr[j] = arr[i] + arr[j] - (arr[i] = arr[j]);

        System.out.println(Arrays.toString(arr));
    }
}
