import java.util.ArrayList;

public class prime_numbers {

    public int[] solve(int A) {

        boolean[] prime = new boolean[A + 1];

        for (int i = 2; i <= Math.sqrt(A); i++) {

            if (!prime[i]) {

                for (int j = i * i; j <= A; j += i)
                    prime[j] = true;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i <= A; i++) {

            if (!prime[i])
                list.add(i);
        }

        int[] res = new int[list.size()];
        int idx = 0;

        for (int val : list)
            res[idx++] = val;

        return res;
    }
}
