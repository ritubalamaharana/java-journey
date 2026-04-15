import java.util.Scanner;

public class GradeCalculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks:");
        float marks = sc.nextFloat();
        if(marks<=100 && marks>=90)
            System.out.print("A Grade.");
        else if(marks>=80)
            System.out.print("B Grade.");
        else if(marks>=70)
            System.out.print("C Grade.");
        else if(marks>=60)
            System.out.print("D Grade.");
        else if(marks>=50)
            System.out.print("E Grade.");
        else
            System.out.print("FAIL!!");

    }
}
