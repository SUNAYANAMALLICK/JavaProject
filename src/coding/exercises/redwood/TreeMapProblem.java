package coding.exercises.redwood;

import java.util.TreeMap;

public class TreeMapProblem {

    public static void getMap() {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("AAA", 12);
        treeMap.put("BBB", 17);
        treeMap.put("CCC", 12);
        treeMap.put("DDD", 17);
        treeMap.put("AAA", 12);
        treeMap.put("BBB", 17);
        treeMap.put("AAA", 12);
        treeMap.put("BBB", 17);
    }

    public static void main(String[] args) {
    }
}
