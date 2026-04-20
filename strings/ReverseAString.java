import java.util.Scanner;

public class ReverseAString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String name = sc.next();
        for(int i=name.length()-1; i>=0; i--){
            System.out.print(name.charAt(i));
        }
    }
}
