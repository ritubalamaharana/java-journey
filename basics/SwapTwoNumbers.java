import java.util.Scanner;

public class SwapTwoNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Before Reverse, num1 is " + num1 + " and num2 is " + num2);
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("After Reverse, num1 is " + num1 + " and num2 is " + num2);
    }
}
