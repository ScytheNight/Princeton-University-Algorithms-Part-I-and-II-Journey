import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class RandomWord {
    public static void main(String[] args) {
        String champion = null; // Holds the randomly chosen word
        int i = 1; // Keeps track of the number of words read

        // Read words until the end of the input
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();

            // Select the word with probability 1/i
            if (Math.random() < 1.0 / i) {
                champion = word;
            }

            // Increment the word count
            i++;
        }

        // Output the selected word
        StdOut.println(champion);
    }
}
