import java.util.HashMap;

public class count_of_divisors {

    private int findMax(int[] arr) {

        int max = arr[0];

        for (int val : arr)
            max = Math.max(max, val);

        return max;
    }

    public int[] solve(int[] A) {

        int max = findMax(A);
        int[] spf = new int[max + 1];

        for (int i = 0; i < spf.length; i++)
            spf[i] = i;

        for (int i = 2; i <= Math.sqrt(max); i++) {

            if (spf[i] == i) {

                for (int j = i * i; j <= max; j += i) {

                    if (spf[j] == j)
                        spf[j] = i;
                }
            }
        }

        int[] res = new int[A.length];
        int idx = 0;

        for (int val : A) {

            int count = 1;
            HashMap<Integer, Integer> map = new HashMap<>();

            if (val == 1) {

                res[idx++] = 1;
                continue;
            }

            while (val > 1) {

                map.put(spf[val], map.getOrDefault(spf[val], 0) + 1);
                val /= spf[val];
            }

            for (int key : map.keySet())
                count *= (map.get(key) + 1);

            res[idx++] = count;
        }

        return res;
    }
}
