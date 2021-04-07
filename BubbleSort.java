import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 8, 9, 3, 0};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - 1 - i; j++)
                if (arr[j] > arr[j + 1])
                    arr[j + 1] = arr[j] + arr[j + 1] - (arr[j] = arr[j + 1]);

        System.out.println(Arrays.toString(arr));


    }
}
