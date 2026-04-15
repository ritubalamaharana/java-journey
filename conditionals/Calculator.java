import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:");
        int num2 = sc.nextInt();
        System.out.print("Enter the operator:");
        char op = sc.next().charAt(0);
        int result;
        switch(op){
            case '+' :
                result = num1+num2;
                System.out.print("Addition of "+num1+" and "+num2+" is "+result);
                break;
            case '-' :
                result = num1-num2;
                System.out.print("Substraction of "+num1+" and "+num2+" is "+result);
                break;
            case '*' :
                result = num1*num2;
                System.out.print("Multiplication of "+num1+" and "+num2+" is "+result);
                break;
            case '/' :
                result = num1/num2;
                System.out.print("Division of "+num1+" and "+num2+" is "+result);
                break;
            case '%' :
                result = num1%num2;
                System.out.print("Modulus of "+num1+" and "+num2+" is "+result);
                break;
            default :
                System.out.print("Invalid operator.");
        }
    }
}
