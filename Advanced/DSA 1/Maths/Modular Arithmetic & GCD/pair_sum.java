import java.util.HashMap;

public class pair_sum {

    public int solve(int[] A, int B) {

        long ans = 0, mod = (long) (1e9 + 7);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++)
            A[i] = A[i] % B;

        for (int val : A)
            map.put(val, map.getOrDefault(val, 0) + 1);

        long count = map.getOrDefault(0, 0);
        ans = (count * (count - 1) / 2) % mod;

        if (B % 2 == 0) {

            count = map.getOrDefault(B / 2, 0);
            ans = (ans + count * (count - 1) / 2) % mod;
        }

        for (int i = 1; i < (B + 1) / 2; i++) {

            int a = map.getOrDefault(i, 0);
            int b = map.getOrDefault(B - i, 0);
            ans = (ans + (a * b)) % mod;
        }

        return (int) ans;
    }
}
