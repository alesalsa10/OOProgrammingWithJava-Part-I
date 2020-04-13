
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        String some = "";
        for (int i = 0; i < array.length; i++){
            some+= array[i] + ", ";
            
        }
        System.out.println(some.replaceAll(", $", ""));
        //the $ looks at the last coma and replaces with ""
    }
}
