package algorithm.search;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DFS<T> implements GraphSearch<T>  {
    @Override
    public void search(Map<T, List<T>> graph, T start) {
        Set<T> visited = new HashSet<>();
        dfs(graph, start, visited);
    }

    private void dfs(Map<T, List<T>> graph, T start, Set<T> visited) {
        if (!visited.contains(start)) {
            visited.add(start);
            System.out.println("Visited node: " + start);

            List<T> neighbors = graph.get(start);
            if (neighbors != null) {
                for (T neighbor : neighbors) {
                    dfs(graph, neighbor, visited);
                }
            }
        }
    }
}
