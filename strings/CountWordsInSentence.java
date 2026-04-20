import java.util.Scanner;

public class CountWordsInSentence {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a str:");
        String str = sc.nextLine();
        int words = 0;
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i) == ' '){
                words++;
            }
        }
        System.out.println(words+1);
    }
}
