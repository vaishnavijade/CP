package HashSet;

import java.util.HashSet;

public class lettersChecker {
    public static int checkIfAllLettersPresent(String str) {
        str = str.toLowerCase(); // Convert to lowercase for uniformity
        HashSet<Character> letters = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch);
            }
        }

        return (letters.size() == 26) ? 1 : -1;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        System.out.println(checkIfAllLettersPresent(input)); // Output: 1

        String missingLetters = "Hello World";
        System.out.println(checkIfAllLettersPresent(missingLetters)); // Output: -1
    }
}
