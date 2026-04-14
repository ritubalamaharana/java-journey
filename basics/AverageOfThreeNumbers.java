import java.util.Scanner;

public class AverageOfThreeNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        float num1 = sc.nextFloat();
        System.out.print("Enter second number:");
        float num2 = sc.nextFloat();
        System.out.print("Enter third number:");
        float num3 = sc.nextFloat();
        float avg = (num1+num2+num3)/3;
        System.out.println(avg);
    }
}
