import java.util.Scanner;

public class CountVowelsInString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String name = sc.next();
        int vowel = 0;
        for(int i=0; i<name.length(); i++){
            switch(name.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    vowel++;
            }
        }
        System.out.println("Number of vowels in "+name+" is:"+vowel);
    }
}
