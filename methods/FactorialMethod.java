import java.util.Scanner;

public class FactorialMethod {
    public static int factorial(int num){
        if(num<=0)
            return 1;
        else
            return num*factorial(num-1);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int fact = factorial(num);
        if(num<0)
            System.out.println("factorial of "+num+" is not defined.");
        else if(num==0)
            System.out.println("factorial of "+num+" is 1.");
        else
            System.out.println("factorial of "+num+" is "+fact);
    }
}
