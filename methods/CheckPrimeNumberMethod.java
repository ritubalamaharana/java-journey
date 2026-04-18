import java.util.Scanner;

public class CheckPrimeNumberMethod {
    public static boolean PrimeNumber(int num){
        int count = 0;
        for(int i=1; i<=num; i++){
            if(num%i==0)
                count++;
        }
        if(count==2)
            return true;
        else
            return false;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        if(PrimeNumber(num))
            System.out.println(num+" is a prime number.");
        else
            System.out.println(num+" is not a prime number.");
    }
}
