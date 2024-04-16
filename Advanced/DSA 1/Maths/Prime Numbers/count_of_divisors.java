import java.util.HashMap;

public class count_of_divisors {

    private int findMax(int[] arr) {

        int max = arr[0];

        for (int val : arr)
            max = Math.max(val, max);

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

        for (int i = 0; i < A.length; i++) {

            if (A[i] == 1)
                continue;

            HashMap<Integer, Integer> map = new HashMap<>();
            int count = 1, val = A[i];

            while (val > 1) {

                map.put(spf[val], map.getOrDefault(spf[val], 0) + 1);
                val /= spf[val];
            }

            for (int key : map.keySet())
                count *= (map.get(key) + 1);

            A[i] = count;
        }

        return A;
    }
}
