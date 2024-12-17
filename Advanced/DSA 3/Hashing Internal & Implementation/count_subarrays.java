import java.util.HashSet;
import java.util.Set;

public class count_subarrays {

    public int solve(int[] A) {
        long ans = 0, mod = (long) (1e9 + 7);
        int l = 0, r = 0;
        Set<Integer> set = new HashSet<>();

        while (r < A.length) {
            if (!set.contains(A[r])) {
                ans = (ans + r - l + 1) % mod;
                set.add(A[r]);
                r++;
            } else {
                while (A[l] != A[r]) {
                    set.remove(A[l]);
                    l++;
                }
                set.remove(A[l]);
                l++;
            }
        }

        return (int) ans;
    }
}
