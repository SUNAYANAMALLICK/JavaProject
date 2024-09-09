package algorithm.search;

import java.util.List;

public class BinarySearch<T extends Comparable<T>> implements Search<T> {

    @Override
    public boolean process(List<T> list, T key) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            T midValue = list.get(mid);
            int comparison = midValue.compareTo(key);

            if (comparison == 0) {
                return true; // Key found
            } else if (comparison < 0) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }

        return false; // Key not found
    }
}
