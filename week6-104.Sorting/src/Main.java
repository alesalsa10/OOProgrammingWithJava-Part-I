import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    public static int smallest(int[] array){
        int small = array[0];
        for (int number: array){
            if (number < small){
                small = number;
            }
        }
        return small;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int indexLocation = 0;
        
        for(int i = 0; i < array.length; i++){
            if (array[i] == smallest(array)){
                indexLocation = i;
            }
        }
        return indexLocation;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int minIndex = index;
        for (int i = index; i < array.length; i++){
            if (array[i] < array[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    public static void swap(int[] array, int index1, int index2){
            int value = array[index1];
            
            array[index1] = array[index2];
            array[index2] = value;
        
    }
    
    public static void sort(int[] array){
        System.out.println(Arrays.toString(array));
        
        for (int i = 0; i < array.length; i++){
            int index = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, index);
            
            System.out.println(Arrays.toString(array));
        }
        
    }
}
