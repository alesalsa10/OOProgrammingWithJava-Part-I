
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        int power = 1;
        int sum = 0;
        int i = 0;
        
        while (i <= number){
            power = (int) Math.pow(2, i);
            sum += power;
            i++;
        }
        System.out.println("The result is " + sum);

    }
}
