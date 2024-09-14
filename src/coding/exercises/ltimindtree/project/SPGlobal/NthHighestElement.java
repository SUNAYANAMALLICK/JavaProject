package coding.exercises.ltimindtree.project.SPGlobal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NthHighestElement {
    public static Optional<Integer> getNthHighestElement(List<Integer> list, int n) {
        return list.stream()
                .distinct()                         // Remove duplicates
                .sorted(Comparator.reverseOrder())  // Sort in descending order
                .skip(n - 1)                        // Skip the first (n-1) elements
                .findFirst();                       // Get the nth element
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 5, 6, 7, 5, 2, 1, 4);
        int n = 3;  // Get the 3rd highest element

        Optional<Integer> nthHighest = getNthHighestElement(numbers, n);

        System.out.println(numbers);

        if (nthHighest.isPresent()) {
            System.out.println("The " + n + "rd highest element is: " + nthHighest.get());
        } else {
            System.out.println("There are less than " + n + " unique elements in the list.");
        }
    }
}
