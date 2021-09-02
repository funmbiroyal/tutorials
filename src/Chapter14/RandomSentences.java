package Chapter14;

import java.security.SecureRandom;
import java.util.Locale;

public class RandomSentences {
    public static void main(String[] args) {
        String [] articles = {"the","a","one","some","day"};
        String [] nouns = {"boy","girl","dog","town","car"};
        String [] verbs = { "drove", "jumped", "ran","walked","skipped"};
        String [] prepositions={ "to", "from", "over", "under" ,"on"};
        SecureRandom secureRandom = new SecureRandom();

        for (int i = 0; i < 20 ; i++) {

            String generatedArticle = String.valueOf(secureRandom.nextInt(articles.length));
//            char[] firstArticle = articles[Integer.parseInt(generatedArticle)].toCharArray();
//            char firstLetter = firstArticle[0];
//            String newFirstLetter = String.valueOf(firstLetter).toUpperCase();
//            System.out.println(newFirstLetter);
            String articleResult = articles[Integer.parseInt(generatedArticle)];

            String generatedNoun = String.valueOf(secureRandom.nextInt(nouns.length));
            String nounResult = nouns[Integer.parseInt(generatedNoun)];

            String generatedVerb = String.valueOf(secureRandom.nextInt(verbs.length));
            String verbResult = verbs[Integer.parseInt(generatedVerb)];

            String generatedPreposition = String.valueOf(secureRandom.nextInt(prepositions.length));
            String prepositionResult = prepositions[Integer.parseInt(generatedPreposition)];

        System.out.println(articleResult +" " + nounResult + " "+ verbResult + " " +prepositionResult + ".");
        }
    }
}
