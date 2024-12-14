import java.util.Random;
import java.util.Scanner;

public class RandonWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        String champion = null;
        int i = 1;  // to keep track of the current word number

        // Read words until end of input
        while (scanner.hasNext()) {
            String word = scanner.next();

            // Select the word with probability 1/i
            if (rand.nextInt(i) == 0) {
                champion = word;
            }

            i++;
        }

        // Output the surviving champion word
        System.out.println(champion);
    }
}
