package Chapter14;

public class WordOccurrence {
    public static void main(String[] args) {
        String sentence = "andhepassedoverandoveragain";
        String word = "he";
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.regionMatches(i, word, 0, word.length())) {
                count++;




        }

    }
        System.out.println(count);




}
}