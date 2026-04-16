package leetcode;

import java.util.*;

/**
 * https://leetcode.com/problems/closest-equal-element-queries/description/?envType=daily-question&envId=2026-04-16
 */
public class ClosestEqualElementQueries_3488 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 4, 1, 3, 2};
        int[] queries = {0, 3, 5};
        System.out.println("Result : " + solveQueries(nums, queries));
    }

    public static List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;

        // Step 1: Map value -> list of indices
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        List<Integer> result = new ArrayList<>();

        // Step 2: Process each query
        for (int idx : queries) {
            int val = nums[idx];
            List<Integer> list = map.get(val);

            // If only one occurrence
            if (list.size() == 1) {
                result.add(-1);
                continue;
            }

            // Binary search to find position
            int pos = Collections.binarySearch(list, idx);

            int prev = list.get((pos - 1 + list.size()) % list.size());
            int next = list.get((pos + 1) % list.size());

            // Circular distance
            int distPrev = Math.min(Math.abs(idx - prev), n - Math.abs(idx - prev));
            int distNext = Math.min(Math.abs(idx - next), n - Math.abs(idx - next));

            result.add(Math.min(distPrev, distNext));
        }

        return result;
    }
}
