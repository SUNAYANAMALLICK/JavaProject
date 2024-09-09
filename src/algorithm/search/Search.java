package algorithm.search;

import java.util.List;

public interface Search<T> {
    boolean process(List<T> list, T key) ;
}
