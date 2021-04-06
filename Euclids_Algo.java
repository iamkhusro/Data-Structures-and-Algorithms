import java.util.Scanner;

public class Euclids_Algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int r = 0;
        if(num2 > num1)
            num2 = num1 + num2 - (num1 = num2);

        while(num1 >= num2)
        {
            r = num1 % num2;
            if(r == 0)
            {
                System.out.println(String.format("HCF: %d", num2));
                return;
            }
            else
            {
                num1 = num2;
                num2 = r;
            }
        }
    }
}
