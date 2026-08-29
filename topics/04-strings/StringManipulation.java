public class StringManipulation {
    public static void main(String[] args) {
        String sentence = "Java is fun to learn";

        String[] words = sentence.split(" ");
        System.out.println("Number of words: " + words.length);
        System.out.println("First word: " + words[0]);
        System.out.println("Last word: " + words[words.length - 1]);

        String joined = String.join("-", words);
        System.out.println("Joined with dashes: " + joined);

        StringBuilder reversed = new StringBuilder(sentence);
        System.out.println("Reversed sentence: " + reversed.reverse());
    }
}