import java.util.Scanner;

public class PositiveOrNegative {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        if(num>0){
            System.out.println(num+" is positive.");
        }
        else if (num<0) {
            System.out.println(num+" is negative.");
        }
        else {
            System.out.println(num+" is zero, means neither positive nor negative.");
        }
    }
}
