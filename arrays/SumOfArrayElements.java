import java.util.Scanner;

public class SumOfArrayElements {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int nums[] =new int[size];
        int sum = 0;
        System.out.println("Array elements are:");
        for(int i=0; i<size; i++){
//            System.out.print("Enter array element "+i+":");
            nums[i] = (int)(Math.random()*100);
            System.out.print(nums[i]+" ");
            sum +=nums[i];
        }
        System.out.println();
        System.out.println("Sum of the elements of the array is:"+sum);
    }
}
