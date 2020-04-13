import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random random = new Random();
    

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random = new Random();
       
    }

    public String createPassword() {
        // write code that returns a randomized password
        String newPassword = ""; //can't be initiated at top because the result won't chage when called
        int i = 0;
        while (i < length){
            char letter = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
            newPassword += letter;
            i++;
    }
    return newPassword;
        
    }
}
