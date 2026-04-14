import java.util.Scanner;

public class SimpleInterest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount:");
        float P = sc.nextFloat();
        System.out.print("Enter the time period:");
        int T = sc.nextInt();
        System.out.print("Enter the rate of interest:");
        float R = sc.nextFloat();
        float SI = (P*T*R)/100;
        System.out.print("Simple interest is: " + SI);
    }
}
