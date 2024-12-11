public class GameService {
    /**
     * This variable represents a secret number. This variable can be referenced anywhere within this GameService class.
     */
    public double secretNumber;

    /**
     * A constructor that will create a GameService object and, by default, set the secretNumber variable to 3.14.
     * There is no need to change anything in this constructor.
     */
    public GameService(){
        secretNumber = 3.14;
    }

    /**
     * This method should return true if guessNumber is equal to the secretNumber, and false otherwise.
     *
     * @param guessNumber the number that the user has input into their console.
     * @return true if guessNumber is equal to the secretNumber, false otherwise.
     */
    public boolean checkGuess(double guessNumber) {
        // Direct comparison of guessNumber with secretNumber
        return guessNumber == secretNumber;
    }
}
