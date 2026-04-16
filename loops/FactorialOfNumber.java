import java.util.Scanner;

public class FactorialOfNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int fact = 1;
        if(num==0){
            System.out.println("Factorial of "+num+" is: 1");
        }else if(num<0){
            System.out.println("There is no factorial for negative numbers. Please enter a positive number. Factorial of "+num+" is undefined.");
        }else{
            for(int i=1; i<=num; i++){
                fact*=i;
            }
            System.out.println("Factorial of "+num+" is: "+fact);
        }
    }
}
