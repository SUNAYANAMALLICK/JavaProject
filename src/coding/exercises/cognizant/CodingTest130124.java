package coding.exercises.cognizant;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodingTest130124 {

    /*

    String str = "hello"

    String str1 = "el"
    Output : true
    String str2 = "ez"
    Output : false
     */

    public static boolean getMatching(String str, String str1) {
        AtomicBoolean value = new AtomicBoolean(false);
        IntStream.range(0, str.length() - str1.length())
                .forEach(i -> {
                    if (IntStream.range(i, i + str1.length()).mapToObj(j -> String.valueOf(str.charAt(j))).collect(Collectors.joining()).equals(str1)) {
                        value.set(true);
                    }
                });
        return value.get();
    }

    public static boolean getMatching1(String str, String str1) {
        int lastIndex = 0;
        for (char c : str1.toCharArray()) {
            int currentIndex = str.indexOf(c);
            if (lastIndex == 0 || currentIndex == lastIndex + 1) {
                lastIndex = currentIndex;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIfCharactersExist(String mainStr, String subStr) {
        int mainIndex = 0; // Index to iterate over the main string

        // Iterate over the characters of the substring
        for (char subChar : subStr.toCharArray()) {
            boolean found = false; // Flag to indicate if character is found in main string

            // Iterate over the remaining characters of the main string
            while (mainIndex < mainStr.length()) {
                char mainChar = mainStr.charAt(mainIndex);

                // If current character of main string matches with current character of substring
                if (mainChar == subChar) {
                    found = true;
                    mainIndex++; // Move to next character in main string
                    break; // Move to next character in substring
                }
                mainIndex++; // Move to next character in main string
            }

            // If character from substring is not found in main string in proper sequence
            if (!found) {
                return false;
            }
        }

        return true; // All characters in substring found in main string in proper sequence
    }

    public static void main(String[] args) {

        String str = "hello";
        String str1 = "el";
        String str2 = "ho";
        System.out.println(getMatching(str, str1));
        System.out.println(getMatching(str, str2));
        System.out.println(getMatching1(str, str1));
        System.out.println(getMatching1(str, str2));
        System.out.println(checkIfCharactersExist(str, str1));
        System.out.println(checkIfCharactersExist(str, str2));
    }
}
