public class Solution {

    public boolean compare(int val, int target, boolean lower) {

        if (lower) return val < target;
        return val <= target;
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int num_occurences(final List<Integer> arr, int target, boolean lower) {

        int l = 0, r = arr.size();
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (compare(arr.get(mid), target, lower)) l = mid + 1;
            else r = mid;
        }

        return l - 1;
    }

    public int findCount(final List<Integer> A, int B) {

        return num_occurences(A, B, false) - num_occurences(A, B, true);
    }
}
