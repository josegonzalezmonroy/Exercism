import java.util.HashSet;
import java.util.Set;

class IsogramChecker {

    boolean isIsogram(String phrase)
    {
        String cleanedPhrase = phrase.replaceAll("[^a-zA-Z]", "").toLowerCase();

        Set<Character> charSet = new HashSet<>();
        for (char c : cleanedPhrase.toCharArray()) 
            if (!charSet.add(c)) 
                return false; 
        return true; 
    }
}
