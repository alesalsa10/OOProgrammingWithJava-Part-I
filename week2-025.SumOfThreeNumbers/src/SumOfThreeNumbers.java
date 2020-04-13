
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable


        // Write your program here
        // Use only variables sum and read
        System.out.println("Type the first number: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int second = Integer.parseInt(reader.nextLine());
        System.out.println("Type the third number: ");
        int third = Integer.parseInt(reader.nextLine());
        sum = first + second + third;

        System.out.println("Sum: " + sum);
    }
}
