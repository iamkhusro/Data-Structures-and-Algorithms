import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {8,6,54,9,23,76,64,1,0};
        InsertionSort.sort(arr); //call by reference
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int n = sc.nextInt();
        int pos = -1;
        int lb = 0;
        int ub = arr.length - 1;
        int mid;

        while (ub >= lb)
        {
            mid = (lb + ub) / 2;

            if(arr[mid] == n)
            {
                pos = mid;
                break;
            }
            else if (arr[mid] < n)
            {
                lb = mid + 1;
            }
            else
            {
                ub = mid - 1;
            }

        }
        if (pos > -1)
            System.out.println("Element found at: " + pos);
        else
            System.out.println("Element not found");
    }
}
