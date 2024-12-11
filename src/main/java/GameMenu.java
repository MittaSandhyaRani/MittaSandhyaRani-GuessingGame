import java.util.Scanner;

public class GameMenu {
    public void startGame() {
        // Using try-with-resources ensures that the Scanner is closed automatically
        try (Scanner userInputScanner = new Scanner(System.in)) {
            // Game logic here using userInputScanner
            System.out.println("Enter a number:");
            int userInput = userInputScanner.nextInt();
            System.out.println("You entered: " + userInput);
        } // userInputScanner will be closed automatically at the end of this block
    }
}
