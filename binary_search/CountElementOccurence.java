import java.util.*;

public class CountElementOccurence {

    public static boolean compare(int val, int target, boolean lower) {

        if (lower) return val < target;
        return val <= target;
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int num_occurences(final List<Integer> arr, int target, boolean lower) {

        int l = 0, r = arr.size();
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (compare(arr.get(mid), target, lower)) l = mid + 1;
            else r = mid;
        }

        return l - 1;
    }

    public static int findCount(final List<Integer> A, int B) {

        return num_occurences(A, B, false) - num_occurences(A, B, true);
    }

    public static void main(String[] args) {

      List<Integer> arr = new ArrayList<>(Arrays.asList(5, 7, 7, 8, 8, 10));

      int res = findCount(arr, 7);
      System.out.println(res);

      int res1 = findCount(arr, 4);
      System.out.println(res1);

      int res2 = findCount(arr, 12);
      System.out.println(res2);

    }
}
