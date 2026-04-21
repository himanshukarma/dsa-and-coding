package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MinimumHammingDistanceAfterSwapOperations_1722 {
    private static int[] parent;

    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4}, target = {2, 1, 4, 5};
        int[][] allowedSwaps = {{0, 1}, {2, 3}};
        System.out.println("Result : " + minimumHammingDistance(source, target, allowedSwaps));
    }

    private static int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }

    private static void unite(int a, int b) {
        parent[find(a)] = find(b);
    }

    public static int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n = source.length;
        parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;

        for (int[] swap : allowedSwaps) {
            unite(swap[0], swap[1]);
        }

        // Group source values by their component root
        Map<Integer, Map<Integer, Integer>> groups = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int root = find(i);
            groups.computeIfAbsent(root, k -> new HashMap<>())
                    .merge(source[i], 1, Integer::sum);
        }

        int hammingDist = 0;
        for (int i = 0; i < n; i++) {
            int root = find(i);
            Map<Integer, Integer> freq = groups.get(root);
            if (freq.getOrDefault(target[i], 0) > 0) {
                freq.merge(target[i], -1, Integer::sum); // matched, consume this source value
            } else {
                hammingDist++;                           // no match found in this component
            }
        }

        return hammingDist;
    }
}
