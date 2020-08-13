package javaAssignments;
import java.util.HashMap;
import java.util.Map;

/**
 * 19. Pangram
 *
 * Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
 * gramma, "every letter") is a sentence using every letter of the alphabet at
 * least once. The best known English pangram is:
 *
 * The quick brown fox jumps over the lazy dog.
 *
 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
 * insensitive. Input will not contain non-ASCII symbols.
 */
public class Pangram {

    public static void main(String[] args) {
        System.out.println(isPangram("the quick brown fox jumps over the lazy dog"));

    }

    public static boolean isPangram(String string) {
        String lowercaseInput = string.toLowerCase();

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : lowercaseInput.toCharArray()) {
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, 1 + frequencyMap.get(c));
            } else {
                frequencyMap.put(c, 1);
            }
        }
        for (char c = 'a'; c <= 'z'; c++) {
            if (frequencyMap.get(c) == null) {
                return false;
            }
        }
        return true;
    }
}
