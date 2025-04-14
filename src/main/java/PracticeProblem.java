import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static ArrayList<String> perms(String str) {
        ArrayList<String> permutations = new ArrayList<>();
        permsHelper("", str, permutations);
        return permutations;
    }

    private static void permsHelper(String usedLetters, String unusedLetters, ArrayList<String> permutations) {
        int n = unusedLetters.length();
        if (n == 0) {
            permutations.add(usedLetters);
        } else {
            for (int i = 0; i < n; i++) {
                permsHelper(usedLetters + unusedLetters.charAt(i),
                              unusedLetters.substring(0, i) + unusedLetters.substring(i + 1, n),
                              permutations);
            }
        }
    }

	public static ArrayList<String> permsUnique(String str) {
        Set<String> permutations = new HashSet<>();
        permsUniqueHelper("", str, permutations);
        return new ArrayList<>(permutations);
    }

    private static void permsUniqueHelper(String usedLetters, String unusedLetters, Set<String> permutations) {
        int n = unusedLetters.length();
        if (n == 0) {
            permutations.add(usedLetters);
        } else {
            for (int i = 0; i < n; i++) {
                permsUniqueHelper(usedLetters + unusedLetters.charAt(i),
                              unusedLetters.substring(0, i) + unusedLetters.substring(i + 1, n),
                              permutations);
            }
        }
    }
	
}
