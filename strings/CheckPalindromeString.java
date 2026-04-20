import java.util.Scanner;

public class CheckPalindromeString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String name = sc.nextLine();
        boolean isBool = true;
        for(int i=0; i<name.length(); i++){
            if(name.charAt(i)!=name.charAt(name.length()-1-i)){
                isBool = false;
                break;
            }
        }
        if (isBool == true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
