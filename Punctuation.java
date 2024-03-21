
public class Punctuation {

    public static void main(String[] args) {
        String text = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end. ";

        String punctuations = "!,.?-()";

        int[] counting_punct = new int[punctuations.length()];
        for (int i = 0; i < counting_punct.length; i++) {
            counting_punct[i] = 0;
        }

        for (char ch : text.toCharArray()) {
            int index = punctuations.indexOf(ch);
            if (index != -1) {
                counting_punct[index]++;
            }
        }

        System.out.println("Punctuation | Count");
        System.out.println("------------------");

        for (int i = 0; i < punctuations.length(); i++) {
            System.out.println(punctuations.charAt(i) + " | " + counting_punct[i]);
        }
    }
}