
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine());
        
        System.out.println("Second: ");
        int second = Integer.parseInt(reader.nextLine());
        
       if(first > second){
           //do nothing here
       }
       while (first <= second){
           System.out.println(first);
           first ++;
       }

    }
}
