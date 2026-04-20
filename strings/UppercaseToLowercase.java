import java.util.Scanner;

public class UppercaseToLowercase {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.next();
        System.out.println(str.toLowerCase());
    }
}
