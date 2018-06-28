import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    Set<String> alphaLetters;

    public PangramChecker() {
        this("abcdefghijklmnopqrstuvwxyz");
    }

    public PangramChecker(String alphabet) {
        alphaLetters = new HashSet<>(
                Arrays.asList(alphabet.split("")));
    }

    public boolean isPangram(String input) {

        for (int i = 0; i < input.length(); i++) {
            String letter = "" + input.toLowerCase().charAt(i);
            if (alphaLetters.contains(letter))
                alphaLetters.remove(letter);
        }
        return alphaLetters.isEmpty();
    }

}
