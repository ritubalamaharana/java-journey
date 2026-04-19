import java.util.Scanner;

public class MinimumNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int size = sc.nextInt();
        int nums[] = new int[size];
        for(int i=0; i<size; i++){
            nums[i] = (int)(Math.random()*100);
            System.out.print(nums[i]+" ");
        }
        int smallest =nums[0];
        for(int i=0; i<size; i++){
            if(nums[i]<=smallest){
                smallest = nums[i];
            }
        }
        System.out.println();
        System.out.println("Largest element of this array is:"+smallest);
    }
}
