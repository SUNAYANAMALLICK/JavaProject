package algorithm.sort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort<T extends Comparable<T>> implements Sort<T>{


    @Override
    public List<T> process(List<T> list) {
        List<T> sortedList = new ArrayList<>(list); // Create a copy of the original list
        int n = sortedList.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                // Compare the adjacent elements
                if (sortedList.get(j).compareTo(sortedList.get(j + 1)) > 0) {
                    // Swap the elements if they are in the wrong order
                    T temp = sortedList.get(j);
                    sortedList.set(j, sortedList.get(j + 1));
                    sortedList.set(j + 1, temp);
                    swapped = true;
                }
            }

            // If no elements were swapped in the inner loop, the list is sorted
            if (!swapped) break;
        }

        return sortedList; // Return the sorted list
    }
}
