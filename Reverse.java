import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String sentence = scan.nextLine();

        StringBuilder sentence_reversed = new StringBuilder(sentence);
        sentence_reversed.reverse();

        System.out.println("Reversed sentence: " + sentence_reversed.toString());
    }
}