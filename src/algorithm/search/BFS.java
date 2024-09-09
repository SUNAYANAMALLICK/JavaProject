package algorithm.search;

import java.util.*;

public class BFS<T> implements GraphSearch<T> {
    @Override
    public void search(Map<T, List<T>> graph, T start) {
        Set<T> visited = new HashSet<>();
        Queue<T> queue = new LinkedList<>();

        // Start with the initial node
        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            T node = queue.poll();
            System.out.println("Visited node: " + node);

            List<T> neighbors = graph.get(node);
            if (neighbors != null) {
                for (T neighbor : neighbors) {
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
    }
}
