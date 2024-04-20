import java.util.ArrayDeque;
import java.util.Queue;

public class perfect_number {

    public int[] solve(int A) {

        if (A == 1)
            return new int[] { 1 };
        if (A == 2)
            return new int[] { 1, 2 };
        if (A == 3)
            return new int[] { 1, 2, 3 };

        Queue<Integer> q = new ArrayDeque<>();
        int[] res = new int[A];
        int idx = 3;
        q.add(1);
        q.add(2);
        q.add(3);
        res[0] = 1;
        res[1] = 2;
        res[2] = 3;
        int ins = 3;

        for (int i = 3; i < A; i++) {

            int val = q.remove();
            int n = 1;

            for (int p = 1; p <= 3; p++) {

                n = val * 10 + p;
                q.add(n);
                res[idx++] = n;
                ins++;

                if (ins == A)
                    return res;
            }
        }

        return res;
    }
}
