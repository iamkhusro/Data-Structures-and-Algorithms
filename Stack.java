import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter max size of stack: ");
        int maxsize = sc.nextInt();
        int[] stack = new int[maxsize];
        int ch;
        int top = -1;

        while (true) {
            System.out.print("\n1: Push\n2: Pop\n3: Peek\n4: Display\n5: Exit\nEnter choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    if (top == maxsize - 1) {
                        System.out.println("Stack Overflow!");
                        break;
                    }
                    System.out.print("Enter number: ");
                    stack[++top] = sc.nextInt();
                    break;

                case 2:
                    if (top == -1) {
                        System.out.println("Stack Underflow!");
                        break;
                    }
                    System.out.println("Popped: " + stack[top--]);
                    break;

                case 3:
                    if (top == -1) {
                        System.out.println("Stack Underflow!");
                        break;
                    }
                    System.out.println(stack[top]);
                    break;

                case 4:
                    if (top > -1) {
                        for (int i = top; i >= 0; i--) {
                            System.out.println(stack[i]);
                        }
                        break;
                    }
                    System.out.println("Stack Underflow!");
                    break;
                case 5:
                    return;

                default:
                    System.out.println("Wrong Input!");



            }
        }
    }
}
