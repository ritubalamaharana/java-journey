import java.util.Scanner;

public class CheckPalindromeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int OriginalNum = num;
        int ReversedNum = 0;
        int rem;
        while(num>0){
            rem = num%10;
            ReversedNum= (ReversedNum*10)+rem;
            num/=10;
        }
        if(OriginalNum == ReversedNum){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
