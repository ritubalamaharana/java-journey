import java.util.Scanner;

public class PrintArrayElements {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int num[] = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter array element "+(i+1)+":");
            num[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0; i<size; i++){
            System.out.print(num[i]+"\t");
        }
    }
}
