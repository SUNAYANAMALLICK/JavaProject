package algorithm.search;

import java.util.List;
import java.util.Map;

public interface GraphSearch<T> {
    void search(Map<T, List<T>> graph, T start);
}