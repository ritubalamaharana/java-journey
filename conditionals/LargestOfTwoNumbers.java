import java.util.Scanner;

public class LargestOfTwoNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:");
        int num2 = sc.nextInt();
        if(num1>num2)
            System.out.print(num1+" is largest.");
        else
            System.out.print(num2+" is largest.");
    }
}
