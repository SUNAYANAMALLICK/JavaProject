package algorithm.search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Search<Integer> input1 = new LinearSearch<>();
        System.out.println(input1.process(List.of(12,5,10,15,31,20,25,2,40), 20));

        Search<Integer> input2 = new BinarySearch<>();
        System.out.println(input2.process(List.of(2,5,7,8,9,20, 44,66,77), 20));

        System.out.println("DFS");

        // Create a sample graph as an adjacency list
        Map<String, List<String>> graph1 = new HashMap<>();
        graph1.put("A", Arrays.asList("B", "C"));
        graph1.put("B", Arrays.asList("D", "E"));
        graph1.put("C", Arrays.asList("F"));
        graph1.put("D", Arrays.asList());
        graph1.put("E", Arrays.asList("F"));
        graph1.put("F", Arrays.asList());

        // Create a DFS instance and perform the search
        GraphSearch<String> dfs = new DFS<>();
        dfs.search(graph1, "A");

        System.out.println("BFS");


        // Create a sample graph as an adjacency list
        Map<String, List<String>> graph2 = new HashMap<>();
        graph2.put("A", Arrays.asList("B", "C"));
        graph2.put("B", Arrays.asList("D", "E"));
        graph2.put("C", Arrays.asList("F"));
        graph2.put("D", Arrays.asList());
        graph2.put("E", Arrays.asList("F"));
        graph2.put("F", Arrays.asList());

        // Create a BFS instance and perform the search
        GraphSearch<String> bfs = new BFS<>();
        bfs.search(graph2, "A");


    }
    }
