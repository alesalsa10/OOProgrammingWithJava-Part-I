import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        
        for (int num: list){
            sum += num;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
       return (double) sum(list)/list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        double mean = average(list);
        double sumVar = 0.0;
        int count = 0;

        for (int number : list) {
            double partMean = number-mean;
            double square = partMean*partMean;
            sumVar+=square;
            count++;
        }
        double variance = (sumVar/(count-1)*1.0);
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
