import java.util.Scanner;

public class EvenOddMethod {
    public static boolean EvenOdd(int num){
        if(num%2==0)
            return true;
        else
            return false;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        if(EvenOdd(num))
            System.out.println(num+" is even.");
        else
            System.out.println(num+" is odd.");
    }
}
