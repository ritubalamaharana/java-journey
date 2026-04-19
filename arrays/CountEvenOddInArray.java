import java.util.Scanner;

public class CountEvenOddInArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int nums[] = new int[size];
        System.out.println("Array elements are:");
        for(int i=0; i<size; i++){
            nums[i] = (int)(Math.random()*100);
            System.out.print(nums[i]+" ");
        }
        int even = 0, odd = 0;
        for(int i = 0; i<size; i++){
            if(nums[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println();
        System.out.println("Number of even elements is: "+even+" and number of odd elements is: "+odd);
    }
}
