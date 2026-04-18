import java.util.Scanner;

public class AddTwoNumbersMethod {
    public static int AddTwoNumbers(int num1, int num2){
        return num1+num2;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 =sc.nextInt();
        System.out.print("Enter second number:");
        int num2 = sc.nextInt();
        int sum = AddTwoNumbers(num1, num2);
        System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
    }
}
