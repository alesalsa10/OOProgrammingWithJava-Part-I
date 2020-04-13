import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       //test here
       int[] original = {1, 2, 3, 4};
       int[] copied = copy(original);
       
       // change the copied
       copied[0] = 99;

       // print both
       System.out.println( "original: " + Arrays.toString(original));
       System.out.println( "copied: " + Arrays.toString(copied));
       
       int[] original1 = {1, 2, 3, 4};
       int[] reverse = reverseCopy(original);

       // print both
       System.out.println( "original: " +Arrays.toString(original1));
       System.out.println( "reversed: " +Arrays.toString(reverse));
       
    }
    
    public static int[] copy(int[] array){
        //creates copy of parameter
        int[] copy = new int[array.length]; //array size must be pre determined
        
        for (int i = 0; i < array.length; i++){
            copy[i] = array[i];
        }
        return copy;
    }
    
    public static int[] reverseCopy(int[] array){
        //return new array with the contensts of parameters in reverse
        int[] reverse = new int[array.length];
        
        for(int i = array.length -1; i >= 0; i--){
            reverse[i] = array[array.length -1 -i];
        }
        return reverse;
    }
}
