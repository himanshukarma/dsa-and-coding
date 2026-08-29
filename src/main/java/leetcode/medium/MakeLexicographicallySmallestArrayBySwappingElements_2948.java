package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MakeLexicographicallySmallestArrayBySwappingElements_2948 {
    public static void main(String[] args) {
        int[] nums = { 3, 7, 9, 2, 1 };
        int limit = 3;
        System.out.println(Arrays.toString(lexicographicallySmallestArray(nums, limit)));
    }

    public static int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        Map<Integer, List<Integer>> group = new HashMap<>();
        Map<Integer, Integer> groupId = new HashMap<>();
        Map<Integer, Integer> pos = new HashMap<>();

        int id = 1;
        group.computeIfAbsent(id, k -> new ArrayList<>()).add(sorted[0]);
        groupId.put(sorted[0], id);

        for (int i = 1; i < n; i++) {
            if (sorted[i] - sorted[i - 1] > limit) {
                id++;
            }

            group.computeIfAbsent(id, k -> new ArrayList<>()).add(sorted[i]);
            groupId.put(sorted[i], id);
        }

        // Rebuild nums using the smallest
        // available value from its group
        for (int i = 0; i < n; i++) {
            int grp = groupId.get(nums[i]);
            int p = pos.getOrDefault(grp, 0);

            nums[i] = group.get(grp).get(p);
            pos.put(grp, p + 1);
        }

        return nums;
    }
}
