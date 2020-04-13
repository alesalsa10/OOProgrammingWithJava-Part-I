import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        int sum = 0;
        int howManyNumbers = 0;
        double average = 0;
        int numbersOfEven = 0;
        int numbersOfOdd = 0;
        
        while (true){
            System.out.println("Type numbers: ");
            int number = Integer.parseInt(reader.nextLine());
            
            if (number == -1){
                break;
            }else{
                sum += number;
                howManyNumbers += 1;
                average = (double) sum / howManyNumbers;
                
                if (number % 2 == 0){
                    numbersOfEven += 1;
                }else{
                    numbersOfOdd += 1;
                }
            }
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + howManyNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + numbersOfEven);
        System.out.println("Odd numbers: " + numbersOfOdd);

    }
}
