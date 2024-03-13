package coding.exercises.hackerrank;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class DenseRankingProblem {
    public static void main(String[] args) {

        List<Integer> ranked = List.of(100, 100, 50, 40, 40, 20, 10);
        List<Integer> player = List.of(5, 25, 50, 120);

        Map<Integer, Integer> rankMap = generateRankMap(ranked);


        List<Integer> playerRank = player.stream().filter(rank -> !ranked.contains(rank))
                .map(val -> {
                    if (ranked.contains(val)) {
                        return rankMap.get(val);
                    } else {
                        int nearestElement = findNearestElement(val, ranked);
                        if (nearestElement != val) {
                            insertMap(rankMap, val, nearestElement);
                        }
                        return rankMap.get(val);
                    }

                })
                .collect(Collectors.toList());

        System.out.println(playerRank);


    }

    public static Map<Integer, Integer> generateRankMap(List<Integer> rank) {
        Map<Integer, Integer> rankMap = new TreeMap<>(Collections.reverseOrder());
        AtomicInteger rnk = new AtomicInteger(1);
        rank.stream().distinct().forEach(num -> rankMap.putIfAbsent(num, rnk.getAndIncrement()));
        return rankMap;
    }

    public static void insertMap(Map<Integer, Integer> rankMap, int element, int nearestElement) {
        rankMap.put(element, (element > nearestElement) ? rankMap.get(nearestElement) : rankMap.get(nearestElement) + 1);
        updateMap(rankMap, element);

    }

    public static void updateMap(Map<Integer, Integer> rankMap, int element) {
        rankMap.keySet().stream()
                .filter(key -> key < element)
                .forEach(key -> rankMap.put(key, rankMap.get(key) + 1));
    }

    public static int findNearestElement(int target, List<Integer> list) {
        return list.stream()
                .min(Comparator.comparingInt(a -> Math.abs(a - target)))
                .orElseThrow(() -> new IllegalArgumentException("List is empty"));
    }

}
