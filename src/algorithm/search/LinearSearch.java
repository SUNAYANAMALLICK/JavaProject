package algorithm.search;

import java.util.List;

public class LinearSearch<T> implements Search<T> {
    @Override
    public boolean process(List<T> list, T key) {

        return list.stream().filter(element -> element.equals(key)).count()>0;

//        for (T element : list) {
//            if (element.equals(key)) {
//                return true; // Key found
//            }
//        }
//        return false; // Key not found
    }

}
